package com.chapter3.bytype;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.Performer;

public class Instrumentalist implements Performer {

	private String song;
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.println("playing " + song + ": ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
