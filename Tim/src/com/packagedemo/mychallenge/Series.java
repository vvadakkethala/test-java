package com.packagedemo.mychallenge;

public class Series {
	
	public static int nSum(int n) {
		int sum = 0;
		for (int i=1;i<=n;i++) {
			sum = sum + i;
		} return sum;
	}
	
	public static int factorial(int n) {
		int factorial = 1;
		for (int i=1;i<=n;i++) {
			factorial = factorial * i;
		} return factorial;
	}
	
	public static int fibonacci(int n) {
		int fibonacci = 0;
		int[] values = new int[n];
		for (int i=0;i<=n;i++) {
			values[i] = i;
			fibonacci = fibonacci + values[i] + values[i+1];
		} return fibonacci;
	}

}
