package com.chapter3.autowired.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.Performer;

public class Instrumentalist2 implements Performer {

	@Value("Jingle Bells")
	private String song;
	@Autowired
	@Qualifier("guitar")
	// @Autowired默认按类型匹配，当有多个类型匹配时，可以通过@Qualifier指定注入ID=guitar的Bean
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.println("playing " + song + ": ");
		instrument.play();
	}

}
