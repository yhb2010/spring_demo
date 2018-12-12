package com.chapter3.autoscan.demo3;

import com.chapter2.bean.Instrument;
import com.chapter3.autowired.demo4.Strummed;

@Strummed
public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("GAR GAR GAR");
	}

}
