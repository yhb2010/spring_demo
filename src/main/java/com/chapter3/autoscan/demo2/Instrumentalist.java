package com.chapter3.autoscan.demo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.Performer;

@Component("kenny")
public class Instrumentalist implements Performer {

	@Value("Jingle Bells")
	private String song;
	@Autowired
	@Qualifier("saxophone")
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.println("playing " + song + ": ");
		instrument.play();
	}

}
