package com.chapter2.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.constructor.PerformanceException;
import com.chapter2.constructor.Performer;

/**
 * 注入bean属性
 * 
 * @author Administrator
 *
 */
public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter2/bean/xml/spring-idol.xml");
		Performer p = (Performer) ctx.getBean("kenny2");
		p.perform();
	}

}
