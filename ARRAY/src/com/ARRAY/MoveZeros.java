package com.ARRAY;

import java.util.Arrays;

public class MoveZeros {
	public static void main(String[] args) {
		int[] arr = { 1, 0, 2, 3, 4, 5, 0, 6, 7, 0 };

		System.out.println(Arrays.toString(arr));

		moveZero(arr);

		System.out.println(Arrays.toString(arr));
	}

	private static void moveZero(int[] arr) {

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}

		while (count < arr.length) {
			arr[count] = 0;
			count++;
		}

	}

}
