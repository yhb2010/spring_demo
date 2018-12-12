package com.chapter2.beanMap;

import java.util.Map;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.PerformanceException;
import com.chapter2.constructor.Performer;

/**
 * 装配集合：一个人可以同时演奏多种乐器
 * 
 * @author Administrator
 *
 */
public class OneManBand implements Performer {
	public OneManBand() {
	}

	public void perform() throws PerformanceException {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}

	private Map<String, Instrument> instruments;

	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments; // <co id="co_injectInstrumentMap"/>
	}
}
