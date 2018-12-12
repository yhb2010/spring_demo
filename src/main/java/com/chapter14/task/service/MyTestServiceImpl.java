package com.chapter14.task.service;

import org.springframework.scheduling.annotation.Scheduled;

public class MyTestServiceImpl implements IMyTestService {

	@Scheduled(cron = "0/4 * *  * * ? ")
	// 每4秒执行一次
	@Override
	public void myTest() {
		//System.out.println("每4秒执行一次");
	}

	@Scheduled(fixedDelay = 2000)
	@Override
	public void myTest2() {
		//System.out.println("2秒执行一次，执行结束后，等待2秒再执行一次");
	}

	@Scheduled(fixedRate = 7000)
	@Override
	public void myTest3() {
		//System.out.println("每7秒执行一次");
	}

}
