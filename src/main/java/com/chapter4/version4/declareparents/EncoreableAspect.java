package com.chapter4.version4.declareparents;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//为被通知的方法引入新方法
//通过aop的命名空间中的declare-parents也可以在xml中声明
@Component
@Aspect
public class EncoreableAspect {
	
	//value：指定了哪种类型的bean要引入该接口，加号表示所有的子类型
	//defaultImpl：指定了为引入功能提供实现的类
	//所标注的静态属性指明了要引入的接口
	@DeclareParents(value = "com.chapter4.version4.aspectj.Performer+", 
            defaultImpl = com.chapter4.version4.declareparents.EncoreableImpl.class)
	public static Encoreable encoreable;
	
}
