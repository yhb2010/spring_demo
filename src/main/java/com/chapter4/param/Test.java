package com.chapter4.param;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.chapter2.constructor.PerformanceException;

/**
 * 为通知传递参数
 *
 * @author dell
 *
 */
public class Test {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter4/param/xml/aop.xml");
		Thinker t = (Thinker) ctx.getBean("volunteer");
		t.thinkOfSomething("我不知道");
	}

}
