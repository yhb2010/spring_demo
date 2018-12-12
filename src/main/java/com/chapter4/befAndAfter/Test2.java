package com.chapter4.befAndAfter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter2.constructor.PerformanceException;
import com.chapter2.constructor.Performer;

/**
 * byName
 *
 * @author dell
 *
 */
public class Test2 {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter4/befAndAfter/xml/aop2.xml");
		Performer p = (Performer) ctx.getBean("kenny");
		p.perform();
	}

}
