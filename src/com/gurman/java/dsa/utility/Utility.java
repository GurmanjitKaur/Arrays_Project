package com.gurman.java.dsa.utility;

import java.util.Arrays;

public class Utility {

	public static void main(String[] args) {
		Utility utility = new Utility();
		int[] array = { 1, 2, 3, 4, 5, 7, 6 };
		utility.swapInArray(array, 5, 6);
		System.out.println("Swap\n" + Arrays.toString(array));
		System.out.println("\nMAX\n" + utility.findMaxInArray(array));
		System.out.println("\nMIN\n" + utility.findMinInArray(array));
		utility.reverseArray(array);
		System.out.println("\nReverse\n" + Arrays.toString(array));
	}

	public void swapInArray(int[] array, int index1, int index2) {
		int temp = array[index1];
		array[index1] = array[index2];
		array[index2] = temp;
	}

	public int findMaxInArray(int[] array) {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}

	public int findMinInArray(int[] array) {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;
	}

	public void reverseArray(int[] array) {
//--------------Using for loop
//		for (int i = 0; i < array.length / 2; i++) {
//			swapInArray(array, i, array.length - i-1);
//		}
		
		
//------------Using while loop
		int start = 0;
		int end = array.length-1;
		while(end >start) {
			swapInArray(array, start, end);
			start++;
			end--;
		}
	}

}
