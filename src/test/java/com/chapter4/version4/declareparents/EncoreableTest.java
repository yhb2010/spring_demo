package com.chapter4.version4.declareparents;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chapter2.constructor.PerformanceException;
import com.chapter4.version4.aspectj.Performer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/chapter4/version4/aspectj/aop.xml"})
public class EncoreableTest {

	@Autowired
	private Performer performer;
	
	@Test
	public void test(){
		//将调用委托给被代理的bean或者被引入的实现，这取决于调用的方法属于被代理的bean还是属于被引入的接口
		((Encoreable)performer).performEncore();
	}
	
}
