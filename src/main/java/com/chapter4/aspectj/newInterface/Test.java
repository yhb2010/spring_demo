package com.chapter4.aspectj.newInterface;

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
public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter4/aspectj/newInterface/xml/aop.xml");
		Performer p = (Performer) ctx.getBean("kenny");
		p.perform();

		Contestant p2 = (Contestant) ctx.getBean("kenny");
		p2.receiveAward();
	}

}
