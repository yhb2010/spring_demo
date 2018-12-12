package com.chapter2.version4.bean;

public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Hearts Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("playing " + title + " by " + artist);
	}

}
