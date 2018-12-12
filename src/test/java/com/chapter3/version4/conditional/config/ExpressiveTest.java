package com.chapter3.version4.conditional.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chapter2.version4.bean.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ExpressiveConfig.class)
public class ExpressiveTest {
	
	@Autowired
	private CompactDisc disc;
	
	@Test
	public void play(){
		disc.play();
	}

}
