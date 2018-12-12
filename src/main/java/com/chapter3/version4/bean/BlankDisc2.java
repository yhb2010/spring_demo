package com.chapter3.version4.bean;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.chapter2.version4.bean.CompactDisc;

@Component
public class BlankDisc2 implements CompactDisc {
	
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

	//从外部配置文件注入值，通过占位符的方式
	public BlankDisc2(String title, String artist, Integer num) {
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
