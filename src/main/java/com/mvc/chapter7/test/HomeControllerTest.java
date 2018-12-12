package com.mvc.chapter7.test;

import java.util.HashMap;
import java.util.List;

import static org.mockito.Mockito.*;
import static java.util.Arrays.asList;
import static org.junit.Assert.*;

import org.junit.Test;

import com.mvc.chapter7.controller.HomeController;
import com.mvc.chapter7.domain.User;
import com.mvc.chapter7.service.UserService;

public class HomeControllerTest {

	@Test
	public void shouldDisplayRecentSpittles() {
		List<User> expectedSpittles = asList(new User(1, "zhang1", "123"));

		UserService userService = mock(UserService.class);
		HomeController controller = new HomeController(userService);

		// 设置方法的预期返回值
		when(userService.getRecentUsers(10)).thenReturn(expectedSpittles);

		HashMap<String, Object> model = new HashMap<String, Object>();
		String viewName = controller.showHomePage(model);

		assertEquals("home", viewName);
		assertSame(expectedSpittles, model.get("spittles"));
		// 验证方法调用
		verify(userService).getRecentUsers(10);
	}

}
