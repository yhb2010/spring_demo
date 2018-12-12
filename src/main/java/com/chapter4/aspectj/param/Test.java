package com.chapter4.aspectj.param;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chapter2.constructor.PerformanceException;
import com.chapter4.param.Thinker;

/**
 * byName
 *
 * @author dell
 *
 */
public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter4/aspectj/param/xml/aop.xml");
		Thinker t = (Thinker) ctx.getBean("volunteer");
		t.thinkOfSomething("我不知道");
	}

}
