package com.mvc.version4.mvc.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.mvc.version4.mvc.domain.Spitter;
import com.mvc.version4.mvc.service.SpittleRepository;

@Controller("homeControllerVersion4")
@RequestMapping(value = "/version4")
public class HomeController {

	@Autowired
	private SpittleRepository spittleRepository;

	@RequestMapping(value = "", method = RequestMethod.GET)
	public String home(){
		return "version4/mvc/home";
	}

	@RequestMapping(value = "/spitter/register", method = RequestMethod.GET)
	public String register(Model model){
		//我们将commandName属性设置为spitter，因此，在模型中必须要有一个key为spitter的对象
		model.addAttribute(new Spitter());
		return "version4/mvc/registerForm";
	}

	@RequestMapping(value = "/spittles", method = RequestMethod.GET)
	public String spittles(@RequestParam(value = "max", defaultValue = "999") int max, @RequestParam(value = "count", defaultValue = "20") int count, Model model){
		//由于返回值是List<Spittle>，所以推断属性名是spittleList
		model.addAttribute(spittleRepository.findSpittles(max, count));
		return "version4/mvc/spittles";
	}

	@RequestMapping(value = "/spittles/{spittleId}", method = RequestMethod.GET)
	//因为名字一致，所以可以省略@PathVariable里的value属性
	public String spittle(@PathVariable int spittleId, Model model){
		//由于返回值是List<Spittle>，所以推断属性名是spittleList
		model.addAttribute(spittleRepository.findOne(spittleId));
		return "version4/mvc/spittle";
	}

	@RequestMapping(value = "/spitter/register", method = RequestMethod.POST)
	public String registerUser(@Valid Spitter spitter, Errors errors){
		if(errors.hasErrors()){
			return "version4/mvc/registerForm";
		}
		spittleRepository.save(spitter);
		//redirect:重定向；forward:前往
		return "redirect:/version4/spitter/" + spitter.getUserName();
	}

	@RequestMapping(value = "/spitter/{userName}", method = RequestMethod.GET)
	public String showSpitterProfile(@PathVariable String userName, Model model){
		//由于返回值是List<Spittle>，所以推断属性名是spittleList
		model.addAttribute(spittleRepository.findByUserName(userName));
		return "version4/mvc/profile";
	}

}
