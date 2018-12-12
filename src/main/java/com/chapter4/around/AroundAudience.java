package com.chapter4.around;

import org.aspectj.lang.ProceedingJoinPoint;

public class AroundAudience {

	/**
	 * 环绕通知
	 * 
	 * @param joinpoint
	 */
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		try {
			System.out.println("The audience is taking their seats.");
			System.out.println("The audience is turning off their cellphones");
			long start = System.currentTimeMillis();

			joinpoint.proceed();
			for (int i = 0; i < 10000; i++) {
				for (int j = 0; j < 1000000; j++) {
					int z = i + 1;
				}
			}

			long end = System.currentTimeMillis();
			System.out.println("CLAP CLAP CLAP CLAP CLAP");
			System.out.println("The performance took " + (end - start)
					+ " milliseconds.");
		} catch (Throwable t) {
			System.out.println("Boo! We want our money back!");
		}
	}

}
