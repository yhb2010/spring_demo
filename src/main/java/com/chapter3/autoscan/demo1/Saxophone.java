package com.chapter3.autoscan.demo1;

import org.springframework.stereotype.Component;

import com.chapter2.bean.Instrument;

@Component("saxophone")
public class Saxophone implements Instrument {

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
