package com.chapter3.autoscan.demo1;

import org.springframework.stereotype.Component;

import com.chapter2.bean.Instrument;

@Component("guitar")
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("GAR GAR GAR");
	}

}
