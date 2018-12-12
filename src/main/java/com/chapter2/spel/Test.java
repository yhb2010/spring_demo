package com.chapter2.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.constructor.PerformanceException;
import com.chapter2.constructor.Performer;

/**
 * 通过setter注入
 *
 * @author dell
 *
 */
public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter2/spel/xml/spel.xml");
		Performer p = (Performer) ctx.getBean("spel");
		p.perform();
		System.out.println("======================");

		p = (Performer) ctx.getBean("spel2");
		p.perform();
	}

}
