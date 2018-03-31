package com.scopedemo.mychallenge;

public class X {
	private int x;
	
	public X(int x) {
		this.x = x;
	}

	public void timesTable() {
		for (x = 1; x <= 12; x++) {
			System.out.println(x + " times " + this.x + " : " + (x * this.x));
		}
	}
}
