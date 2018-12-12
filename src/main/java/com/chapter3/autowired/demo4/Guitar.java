package com.chapter3.autowired.demo4;

import org.springframework.beans.factory.annotation.Qualifier;

import com.chapter2.bean.Instrument;

@Qualifier("stringed")
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("GAR GAR GAR");
	}

}
