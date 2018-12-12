package com.chapter3.autowired.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.Performer;

public class Instrumentalist implements Performer {

	@Value("Jingle Bells")
	private String song;
	@Autowired
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.println("playing " + song + ": ");
		instrument.play();
	}

}
