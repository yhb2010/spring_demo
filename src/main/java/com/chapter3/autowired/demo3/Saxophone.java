package com.chapter3.autowired.demo3;

import org.springframework.beans.factory.annotation.Qualifier;

import com.chapter2.bean.Instrument;

@Qualifier("saxophone")
public class Saxophone implements Instrument {

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
