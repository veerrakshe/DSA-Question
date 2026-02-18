package Feb2026;

public class BinaryNumberWithAlternateBits_693 {
	class Solution {
		public boolean hasAlternatingBits(int n) {
			int result = n ^ (n >> 1);
			return (result & (result + 1)) == 0;
		}
}
