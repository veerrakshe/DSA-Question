package com.ARRAY;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };

		System.out.println(duplicat(arr));
	}

	private static boolean duplicat(int[] arr) {

		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (h.contains(arr[i])) {
				return true;
			} else {
				h.add(arr[i]);
			}
		}

		return false;

	}
}
