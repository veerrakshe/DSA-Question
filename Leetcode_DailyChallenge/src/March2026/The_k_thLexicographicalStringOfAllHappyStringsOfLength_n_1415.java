package March2026;

public class The_k_thLexicographicalStringOfAllHappyStringsOfLength_n_1415 {
	class Solution {
		int count = 0;
		String ans = "";

		public void find(int n, int k, StringBuilder sb) {

			// early stopping if answer found
			if (ans.length() > 0)
				return;

			// if current string length == n
			if (sb.length() == n) {
				count++;

				if (count == k) {
					ans = sb.toString();
				}
				return;
			}

			// try characters a,b,c
			for (char ch : new char[] { 'a', 'b', 'c' }) {

				// ensure adjacent characters are different
				if (sb.length() == 0 || sb.charAt(sb.length() - 1) != ch) {

					sb.append(ch);
					find(n, k, sb);
					sb.deleteCharAt(sb.length() - 1); // backtrack
				}
			}
		}

		public String getHappyString(int n, int k) {
			find(n, k, new StringBuilder());
			return ans;
		}
	}
}
