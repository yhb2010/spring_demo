package com.chapter3.autoscan.demo2;

import com.chapter2.bean.Instrument;

public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("GAR GAR GAR");
	}

}
