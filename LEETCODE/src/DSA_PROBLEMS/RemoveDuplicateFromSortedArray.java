package DSA_PROBLEMS;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 3, 4 };

		System.out.println(uniqueArray(arr));

		System.out.println(Arrays.toString(arr));
	}

	private static int uniqueArray(int[] arr) {

		int count = 1;

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[count - 1]) {

				arr[count] = arr[i];

				count++;
			}
		}
		return count;

	}

}
