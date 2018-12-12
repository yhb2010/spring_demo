package com.chapter14.placeholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chapter2.constructor.PerformanceException;

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
				"com/chapter14/placeholder/xml/bytype.xml");
		Dbconfig p = (Dbconfig) ctx.getBean("dbconfig");
		p.show();
	}

}
