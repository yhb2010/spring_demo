package com.chapter4.version4.aspectj;

import java.util.List;

import org.springframework.stereotype.Component;

import com.chapter2.version4.bean.CompactDisc;

@Component
public class WhiteDisc {
	
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

	public void play() {
		System.out.println("playing " + title + " by " + artist);
	}
	
	public void playTrack(int trackNum){
		System.out.println("playing " + tracks.get(trackNum - 1));
	}

}
