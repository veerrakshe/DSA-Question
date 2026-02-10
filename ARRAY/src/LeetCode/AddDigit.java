package LeetCode;

public class AddDigit {

	public static void main(String[] args) {
		int number = 18022005;

		System.out.println(addDigit(number));
		;
	}

	private static int addDigit(int number) {
		// TODO Auto-generated method stub
		if (number == 0) {
			return 0;
		}
		return (number % 9 == 0) ? 9 : 0; // Shortcut to write IF-Else Statement [Condition ? true : false ]

	}

}
