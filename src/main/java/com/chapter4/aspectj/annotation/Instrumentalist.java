//一个乐器演奏家
package com.chapter4.aspectj.annotation;

import org.springframework.stereotype.Service;

import com.chapter2.bean.Instrument;
import com.chapter2.constructor.PerformanceException;

@Service("annotationInstrumentalist")
public class Instrumentalist implements Performer {
	public Instrumentalist() {
	}

	@OperateAspce(message = "adb")
	public void perform() throws PerformanceException {
		System.out.print("Playing " + song + " : ");
		instrument.play();
	}

	private String song;

	public void setSong(String song) { // 注入歌曲
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	public String screamSong() {
		return song;
	}

	private Instrument instrument;

	public void setInstrument(Instrument instrument) { // 注入乐器
		this.instrument = instrument;
	}
}
