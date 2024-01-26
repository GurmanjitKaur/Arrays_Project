package com.gurman.java.dsa.array;

import java.util.Arrays;

public class Initializing_Arrays_1 {

	public static void main(String[] args) {
		int[] intArrayA = new int[5];

		int[] intArrayB = { 2, 3, 4, 6, 78 };
		
		//Array Traversal
		//1) Using loops can be done
		//2) Using below method
		System.out.println(Arrays.toString(intArrayA) + "-----" + Arrays.toString(intArrayB));
	}
}
