package com.chapter2.beanList;

import java.util.Collection;
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
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}

	private Collection<Instrument> instruments;

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

}
