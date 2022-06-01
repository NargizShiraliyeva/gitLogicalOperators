package com.syntax.week1;

public class Task10 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array?

		int[] num = { 34, 7, 24, 9, 16 };

		int largest = 0;
		int secondLargest = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > largest) {
				secondLargest = largest;
				largest = num[i];
			} else if (num[i] > secondLargest) {
				secondLargest = num[i];
			}
		}
		System.out.println("The second largest number is "+secondLargest);

	}
}
