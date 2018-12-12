package com.chapter4.version4.aspectj;

import java.util.ArrayList;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chapter2.constructor.PerformanceException;
import com.chapter2.version4.bean.CompactDisc;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:com/chapter4/version4/aspectj/aop.xml"})
public class TrackNumTest {

	@Autowired
	private WhiteDisc whiteDisc;
	@Autowired
	private TrackCounter trackCounter;
	
	@Test
	public void test(){
		whiteDisc.setTracks(new ArrayList(){{
			add("Getting Better");
			add("Fixing a Hole");
			add("Lucy in the Sky with Diamonds");
			add("With a Little Help from My Friends");
		}});
		whiteDisc.playTrack(1);
		whiteDisc.playTrack(1);
		whiteDisc.playTrack(1);
		whiteDisc.playTrack(3);
		System.out.println(trackCounter.getPlayCount(1));
		System.out.println(trackCounter.getPlayCount(2));
		System.out.println(trackCounter.getPlayCount(3));
	}
	
}
