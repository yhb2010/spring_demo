package com.chapter4.befAndAfter;

/**
 * 观众类
 * 
 * @author Administrator
 *
 */
public class Audience {
	public void takeSeats() { // 表演之前
		System.out.println("The audience is taking their seats.");
	}

	public void turnOffCellPhones() { // 表演之前
		System.out.println("The audience is turning off their cellphones");
	}

	public void applaud() { // 表演之后
		System.out.println("CLAP CLAP CLAP CLAP CLAP");
	}

	public void demandRefund() { // 表演失败之后
		System.out.println("Boo! We want our money back!");
	}
}