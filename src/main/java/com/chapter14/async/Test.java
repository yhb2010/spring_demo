package com.chapter14.async;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chapter14.async.service.AsyncService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter14/async/xml/async.xml");
		AsyncService p = (AsyncService) ctx.getBean("asyncService");

		p.testAsyncMethod();
		System.out.println("我已经执行了！");
	}

}
