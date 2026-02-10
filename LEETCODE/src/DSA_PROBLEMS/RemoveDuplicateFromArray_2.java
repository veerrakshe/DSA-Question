package DSA_PROBLEMS;

public class RemoveDuplicateFromArray_2 {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3 };

		System.out.println(duplicat(arr));
	}

	private static int duplicat(int[] arr) {

		int i = 0;

		for (int n : arr) {

			if (i < 2 || n != arr[i - 2]) {

				arr[i++] = n;
			}
		}
		return i;
	}

}
