package com.chapter2.version4.bean;

import java.util.List;

public class BlankDisc implements CompactDisc {
	
	private String title;
	private String artist;
	private Integer num;
	private List<String> tracks;

	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setTracks(List<String> tracks) {
		this.tracks = tracks;
	}

	public void setNum(Integer num) {
		this.num = num;
	}

	public BlankDisc(String title, String artist, Integer num) {
		super();
		this.title = title;
		this.artist = artist;
		this.num = num;
	}

	@Override
	public void play() {
		System.out.println("playing " + title + " by " + artist);
	}

}
