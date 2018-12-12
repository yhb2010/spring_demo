package com.chapter2.spelCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 通过setter注入
 *
 * @author dell
 *
 */
public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter2/spelCollection/xml/spel.xml");
		ChosenCity p = (ChosenCity) ctx.getBean("spel");
		p.printChosen();
		p.printRandomChosen();
		System.out.println("=========================");

		ChosenCity2 p2 = (ChosenCity2) ctx.getBean("spel2");
		p2.printChosen();
		p2.printFirstEndChosen();
		p2.printNames();
	}

}
