package com.chapter3.version4.spel;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/chapter3/version4/spel/bytype.xml"})
public class ListCustomerTest {
	
	@Autowired
	private ListCustomer listCustomer;
	
	@Test
	public void test(){
		System.out.println(listCustomer.toString());
	}

}
