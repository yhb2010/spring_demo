package com.chapter4.aspectj.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Service;

@Service("aroundAudience2")
@Aspect
public class AroundAudience2 {

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
	@Around(value = "@annotation(op)")
	public void watchPerformance(ProceedingJoinPoint joinpoint, OperateAspce op) {
		try {
			System.out.println(op.message());
			System.out.println("被拦截了2");
			joinpoint.proceed();

		} catch (Throwable t) {
			System.out.println("Boo! We want our money back!");
		}
	}

}
