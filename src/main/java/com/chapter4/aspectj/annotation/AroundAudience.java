package com.chapter4.aspectj.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

@Service("aroundAudience")
@Aspect
public class AroundAudience {

	@Pointcut(value = "@annotation(com.chapter4.aspectj.annotation.OperateAspce)")
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
		try {
			System.out.println("被拦截了");
			joinpoint.proceed();

		} catch (Throwable t) {
			System.out.println("Boo! We want our money back!");
		}
	}

}
