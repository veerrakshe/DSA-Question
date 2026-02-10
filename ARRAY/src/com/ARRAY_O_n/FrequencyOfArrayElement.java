package com.ARRAY_O_n;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 1, 3, 5, 4 };

		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(arr[i])) {
				hm.put(arr[i], hm.get(arr[i]) + 1);
			} else {
				hm.put(arr[i], 1);
			}
		}

		for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			System.out.println("Number :- " + entry.getKey() + "  Frequency :- " + entry.getValue());

		}
	}

}
