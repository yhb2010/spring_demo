package com.chapter2.spel;

import com.chapter2.constructor.Performer;

public class Instrumentalist2 implements Performer {

	private String song;
	private String song2;
	private float pi;
	private float randomNum;

	@Override
	public void perform() {
		System.out.println("playing 《" + song + "》: ");
		System.out.println("playing 《" + song2 + "》: ");
		System.out.println(pi);
		System.out.println(randomNum);
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getSong2() {
		return song2;
	}

	public void setSong2(String song2) {
		this.song2 = song2;
	}

	public String songSelect() {
		return "abc";
	}

	public float getPi() {
		return pi;
	}

	public void setPi(float pi) {
		this.pi = pi;
	}

	public float getRandomNum() {
		return randomNum;
	}

	public void setRandomNum(float randomNum) {
		this.randomNum = randomNum;
	}

}
