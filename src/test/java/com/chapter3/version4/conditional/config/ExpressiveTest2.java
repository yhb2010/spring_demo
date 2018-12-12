package com.chapter3.version4.conditional.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chapter2.version4.bean.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig2.class)
public class ExpressiveTest2 {
	
	@Autowired
	private CompactDisc blankDisc2;
	
	@Test
	public void play(){
		blankDisc2.play();
	}

}
