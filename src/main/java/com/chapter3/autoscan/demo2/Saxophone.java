package com.chapter3.autoscan.demo2;

import com.chapter2.bean.Instrument;

public class Saxophone implements Instrument {

	@Override
	public void play() {
		System.out.println("TOOT TOOT TOOT");
	}

}
