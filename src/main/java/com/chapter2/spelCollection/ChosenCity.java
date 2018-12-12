package com.chapter2.spelCollection;

public class ChosenCity {

	private City chosen;
	private City randomChosen;

	public City getChosen() {
		return chosen;
	}

	public void setChosen(City chosen) {
		this.chosen = chosen;
	}

	public City getRandomChosen() {
		return randomChosen;
	}

	public void setRandomChosen(City randomChosen) {
		this.randomChosen = randomChosen;
	}

	public void printChosen() {
		System.out.println(chosen);
	}

	public void printRandomChosen() {
		System.out.println(randomChosen);
	}

}
