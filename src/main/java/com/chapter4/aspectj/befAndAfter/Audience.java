package com.chapter4.aspectj.befAndAfter;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Audience {
	/**
     * Pointcut
     * 定义Pointcut，Pointcut的名称为performance()，此方法没有返回值和参数
     * 该方法就是一个标识，不进行调用
     */
	@Pointcut("execution(* com.chapter2.constructor.Performer.perform(..))")
	public void performance() {
	}

	 /**
     * Before
     * 在核心业务执行前执行，不能阻止核心业务的调用。
     * @param joinPoint
     */
	@Before("performance()")
	public void takeSeats() {
		System.out.println("The audience is taking their seats.");
	}

	@Before("performance()")
	public void turnOffCellPhones() {
		System.out.println("The audience is turning off their cellphones");
	}

	/**
     * AfterReturning
     * 核心业务逻辑调用正常退出后，不管是否有返回值，正常退出后，均执行此Advice
     * @param joinPoint
     */
	@AfterReturning("performance()")
	public void applaud() {
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	/**
     * 核心业务逻辑调用异常退出后，执行此Advice，处理错误信息
     *
     * 注意：执行顺序在Around Advice之后
     * @param joinPoint
     * @param ex
     */
	@AfterThrowing("performance()")
	public void demandRefund() {
		System.out.println("Boo! We want our money back!");
	}
}