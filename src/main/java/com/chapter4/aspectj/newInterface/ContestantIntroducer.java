package com.chapter4.aspectj.newInterface;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

	@DeclareParents(value = "com.chapter2.constructor.Performer+", defaultImpl = GraciousContestant.class)
	public static Contestant contestant;// 将被引入的接口

}