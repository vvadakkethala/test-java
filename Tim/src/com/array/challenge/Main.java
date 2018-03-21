package com.array.challenge;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int[] myarray = getIntegers(5);
		int[] sortedarray = sortInteger(myarray);
		printInteger(sortedarray);

	}

	private static int[] getIntegers(int number) {
		System.out.println("Please enter " + number + " numbers");
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}
		return values;

	}

	private static void printInteger(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Element " + i + " value is : " + array[i]);
		}
	}

	private static int[] sortInteger(int[] array) {
		int[] sortedArray = new int[array.length];
		for (int i = 0; i < sortedArray.length; i++) {
			sortedArray[i] = array[i];
		}

		boolean flag = true;
		int temp;
		while (flag) {
			flag = false;
			for (int i = 0; i < sortedArray.length - 1; i++) {
				if (sortedArray[i] < sortedArray[i + 1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i + 1];
					sortedArray[i + 1] = temp;
					flag = true;
				}
			}
		}
		return sortedArray;

	}

}
