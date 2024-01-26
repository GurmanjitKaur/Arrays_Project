package com.gurman.java.dsa.searching;

public class LinearSearch {

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 7, 6 };

		System.out.println("Target is present at index " + linearSearchInArray(array, 4));
	}

	private static int linearSearchInArray(int[] array, int targetToSearch) {

		for (int i = 0; i < array.length; i++) {
			if (array[i] == targetToSearch) {
				return i;
			}
		}
		return -1;
	}

}
