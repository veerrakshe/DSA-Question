package March2026;

public class CheckIfBinaryStringHasAtMostOneSegmentofOnes_1784 {
	class Solution {
		public boolean checkOnesSegment(String s) {
			return !s.contains("01");
		}
	}
}
