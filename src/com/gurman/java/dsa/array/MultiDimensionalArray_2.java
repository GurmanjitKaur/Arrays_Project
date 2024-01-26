package com.gurman.java.dsa.array;

import java.util.Arrays;

public class MultiDimensionalArray_2 {

	public static void main(String[] args) {
		/*
		 * 	[ 1 2 3 4
		 *    5 6 7 8 9
		 *    9 0 3]
		 * 
		 * This is 2 D array with 3 rows and each row has arrays of different length
		 * */
		
		//
		
		int[][] array = {{1,2,3,4},
						 {5,6,7,8,9},
						 {9,0,3}};
		
		for (int row = 0; row < array.length; row++) {
			for (int col = 0; col < array[row].length; col++) {
				System.out.print(array[row][col]+" ");
			}
			System.out.println();
		}
		//OR
		System.out.println("\n");
		for (int row = 0; row < array.length; row++) {
			System.out.println(Arrays.toString(array[row]));
		}
		
		//OR
		System.out.println("\n\n");
		for (int[] a : array) {
			System.out.println(Arrays.toString(a));
		}

	}

}
