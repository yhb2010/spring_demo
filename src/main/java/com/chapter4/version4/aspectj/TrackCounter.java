package com.chapter4.version4.aspectj;

import java.util.HashMap;
import java.util.Map;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
//播放磁道的计数器
public class TrackCounter {
	
	private Map<Integer, Integer> trackCounts = new HashMap<Integer, Integer>();
	
	@Pointcut("execution(** com.chapter4.version4.aspectj.WhiteDisc.playTrack(int)) && args(trackNum)")
	public void trackPlayed(int trackNum){
		
	}
	
	//表演开始前
	@Before("trackPlayed(trackNum)")
	public void countTrack(int trackNum){
		int currentCount = getPlayCount(trackNum);
		trackCounts.put(trackNum, currentCount + 1);
	}
	
	public int getPlayCount(int trackNum){
		return trackCounts.containsKey(trackNum) ? trackCounts.get(trackNum) : 0;
	}
	
}
