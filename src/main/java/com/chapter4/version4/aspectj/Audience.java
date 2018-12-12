package com.chapter4.version4.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Audience {
	
	//标示方法
	//within(com.chapter4.version4.aspectj.*)：com.chapter4.version4.aspectj包下任意方法被调用时
	//bean('performerImpl')：bean id为performerImpl
	@Pointcut("execution(** com.chapter4.version4.aspectj.Performer.perform(..))")
	public void performance(){
		
	}
	
	//表演开始前
	@Before("performance()")
	public void silenceCellPhones(){
		System.out.println("Silencing cell phones");
	}
	
	//表演开始前
	@Before("performance()")
	public void takesSeats(){
		System.out.println("Taking seats");
	}
	
	//表演成功后
	@AfterReturning("performance()")
	public void applause(){
		System.out.println("CLAP CLAP CLAP!!!");
	}
	
	//表演失败后
	@AfterThrowing("performance()")
	public void demandRefund(){
		System.out.println("Demanding a refund");
	}
	
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint jp){
		System.out.println("watching");
		try {
			jp.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("watching!!!");
	}

}
