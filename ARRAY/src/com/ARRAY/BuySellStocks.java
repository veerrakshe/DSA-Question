package com.ARRAY;

public class BuySellStocks {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 5, 3, 6, 4 };

		int minPrice = arr[0];
		int max = 0;

		for (int i : arr) {
			if (i < minPrice) {
				minPrice = i;
			} else {
				max = Math.max(max, i - minPrice);
			}
		}
		System.out.println(max);
	}

}
