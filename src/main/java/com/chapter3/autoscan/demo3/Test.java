package com.chapter3.autoscan.demo3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.constructor.PerformanceException;
import com.chapter2.constructor.Performer;

/**
 * byType
 *
 * @author dell
 *
 */
public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter3/autoscan/demo3/xml/bytype.xml");
		Performer p = (Performer) ctx.getBean("kenny");
		p.perform();
	}

}
