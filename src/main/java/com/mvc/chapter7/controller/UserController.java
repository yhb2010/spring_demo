package com.mvc.chapter7.controller;

import java.io.File;

import javax.validation.Valid;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mvc.chapter7.domain.User;
import com.mvc.chapter7.service.UserService;

@Controller
// 类级别的@RequestMapping定义了这个控制器所处理的根URL路径
@RequestMapping("/users")
public class UserController {

	private UserService userService;

	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}

	// 针对/users/user的get请求
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public String listUserByName(@RequestParam("name") String username,
			Model model) {
		model.addAttribute(userService.getUserByName(username));
		return "user/detail";
	}

	// @RequestParam修饰参数，required=false该参数不是必须的
	// Expected MultipartHttpServletRequest: is a MultipartResolver
	// configured问题：
	// 1、引入包commons-fileupload-X.X.jar，2、在springmvc配置文件中增加配置CommonsMultipartResolver
	@RequestMapping(method = RequestMethod.POST)
	public String add(@Valid User user, BindingResult bindingResult,
			@RequestParam(value = "image", required = false) MultipartFile image) {
		if (bindingResult.hasErrors()) {
			return "user/edit";
		}
		userService.saveUser(user);

		if (!image.isEmpty()) {
			try {
				validateImage(image);

				saveImage("e:/zsl/" + user.getId() + ".jpg", image);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		// redirect：请求会被重定向到指定路径
		return "redirect:/users/user?name=" + user.getName();
	}

	private void validateImage(MultipartFile image) throws Exception {
		if (!image.getContentType().equals("image/jpeg")) {
			throw new Exception("Only JPG images accepted");
		}
	}

	private void saveImage(String filename, MultipartFile image)
			throws Exception {
		File f = new File(filename);
		FileUtils.writeByteArrayToFile(f, image.getBytes());
	}

}
