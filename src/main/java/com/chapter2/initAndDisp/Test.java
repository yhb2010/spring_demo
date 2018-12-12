package com.chapter2.initAndDisp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 初始化、销毁bean时调用
 * 
 * @author Administrator
 *
 */
public class Test {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter2/initAndDisp/xml/spring-idol.xml");
		Auditoroum s = (Auditoroum) ctx.getBean("auditoroum");
	}

}
