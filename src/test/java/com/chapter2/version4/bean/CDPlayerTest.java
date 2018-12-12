package com.chapter2.version4.bean;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chapter2.version4.bean.config.CDPlayerConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

	@Autowired
	private MediaPlayer cdPlayer;
	@Autowired
	private CompactDisc sgtPeppers;

	@Test
	public void play(){
		cdPlayer.play();
	}

}
