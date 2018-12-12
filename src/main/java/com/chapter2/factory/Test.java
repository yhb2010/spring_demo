package com.chapter2.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过工厂创建bean
 * 
 * @author Administrator
 *
 */
public class Test {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter2/factory/xml/spring-idol.xml");
		Stage s = (Stage) ctx.getBean("stage");
	}

}
