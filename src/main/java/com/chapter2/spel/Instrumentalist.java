package com.chapter2.spel;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.Performer;

public class Instrumentalist implements Performer {

	private String song;
	private boolean b;
	private Instrument instrument;

	@Override
	public void perform() {
		System.out.println("b：" + b);
		System.out.print("playing 《" + song + "》: ");
		instrument.play();
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public Instrument getInstrument() {
		return instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

}
