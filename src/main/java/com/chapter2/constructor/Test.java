package com.chapter2.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过构造器注入
 * 
 * @author Administrator
 *
 */
public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter2/constructor/xml/spring-idol.xml");
		Performer p = (Performer) ctx.getBean("poeticDuke");
		p.perform();
	}

}
