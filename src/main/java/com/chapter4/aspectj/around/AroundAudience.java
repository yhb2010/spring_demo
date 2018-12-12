package com.chapter4.aspectj.around;

import java.lang.reflect.Method;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

@Aspect
public class AroundAudience {

	@Pointcut("execution(* com.chapter2.constructor.Performer.perform(..))")
	public void performance() {
	}

	/**
     * Around
     * 手动控制调用核心业务逻辑，以及调用前和调用后的处理,
     *
     * 注意：当核心业务抛异常后，立即退出，转向AfterAdvice
     * 执行完AfterAdvice，再转到ThrowingAdvice
     * @param pjp
     * @return
     * @throws Throwable
     */
	@Around("performance()")
	public void watchPerformance(ProceedingJoinPoint joinpoint) {
		//获取被拦截的方法对象
		Signature signature = joinpoint.getSignature();
		MethodSignature methodSignature = (MethodSignature)signature;
		Method method = methodSignature.getMethod();

		try {
			long start = System.currentTimeMillis();
			joinpoint.proceed();

			for (int i = 0; i < 10000; i++) {
				for (int j = 0; j < 1000000; j++) {
					int z = i + 1;
				}
			}
			long end = System.currentTimeMillis();
			System.out.println("The performance took " + (end - start)
					+ " milliseconds.");
		} catch (Throwable t) {
			System.out.println("Boo! We want our money back!");
		}
	}

}
