package com.chapter14.async;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chapter14.async.service.AsyncService;

public class TestReturn {

	public static void main(String[] args) throws InterruptedException,
			ExecutionException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/chapter14/async/xml/async.xml");
		AsyncService p = (AsyncService) ctx.getBean("asyncService");

		Future<Long> f = p.findBalanceAsync(54546l);
		System.out.println("我已经执行了！");

		while (true) { // /这里使用了循环判断，等待获取结果信息
			if (f.isDone()) { // 判断是否执行完毕
				System.out.println("Result from asynchronous process - "
						+ f.get());
				break;
			}
		}

		System.out.println("后面的操作");
	}

}
