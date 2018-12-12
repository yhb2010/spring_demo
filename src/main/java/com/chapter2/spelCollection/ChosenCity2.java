package com.chapter2.spelCollection;

import java.util.List;

public class ChosenCity2 {

	private List<City> bigCities;
	private City firstBigCities;
	private City endBigCities;
	private List<String> cityNames;

	public List<City> getBigCities() {
		return bigCities;
	}

	public void setBigCities(List<City> bigCities) {
		this.bigCities = bigCities;
	}

	public City getFirstBigCities() {
		return firstBigCities;
	}

	public void setFirstBigCities(City firstBigCities) {
		this.firstBigCities = firstBigCities;
	}

	public City getEndBigCities() {
		return endBigCities;
	}

	public void setEndBigCities(City endBigCities) {
		this.endBigCities = endBigCities;
	}

	public List<String> getCityNames() {
		return cityNames;
	}

	public void setCityNames(List<String> cityNames) {
		this.cityNames = cityNames;
	}

	public void printChosen() {
		for (City city : bigCities) {
			System.out.println(city);
		}
	}

	public void printFirstEndChosen() {
		System.out.println("firstBigCities=" + firstBigCities
				+ ", endBigCities=" + endBigCities);
	}

	public void printNames() {
		for (String name : cityNames) {
			System.out.println(name);
		}
	}

}
