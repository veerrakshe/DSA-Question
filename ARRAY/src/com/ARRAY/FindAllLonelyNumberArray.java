package com.ARRAY;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindAllLonelyNumberArray {

	public static void main(String[] args) {

		int[] arr = { 10, 6, 5, 8 };

		System.out.println(numbers(arr));
	}

	private static List<Integer> numbers(int[] arr) {
		List<Integer> result = new ArrayList<Integer>();

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (map.get(arr[i]) == 1 && !map.containsKey(arr[i] + 1) && !map.containsKey(arr[i] - 1)) {
				result.add(arr[i]);
			}
		}

		return result;
	}

}
