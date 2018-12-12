package com.chapter2.version4.bean;

public class CDPlayer implements MediaPlayer {

	private CompactDisc cd;

	public CDPlayer(CompactDisc cd){
		this.cd = cd;
	}

	@Override
	public void play() {
		cd.play();
	}

}
