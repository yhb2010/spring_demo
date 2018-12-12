package com.chapter14.async.service;

import java.util.concurrent.Future;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;

public class AsyncService {

	@Async
	public void testAsyncMethod() {
		try {
			// 让程序暂停5秒，相当于执行一个很耗时的任务
			Thread.sleep(5000);
			System.out.println("========结束=======");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 带返回值的异步方法
	@Async
	public Future<Long> findBalanceAsync(Long input) {
		try {
			// 让程序暂停5秒，相当于执行一个很耗时的任务
			Thread.sleep(5000);
			input = input * 1000;
			System.out.println("========返回值结束=======");
			return new AsyncResult<Long>(input);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
