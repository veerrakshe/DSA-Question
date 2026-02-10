// LeetCode 3719 - Longest Balanced Subarray
// Approach: Brute Force + HashSet
// Time: O(n^2), Space: O(n)

import java.util.*;

class Solution {
	public int longestBalanced(int[] nums) {

		int maxLen = 0;

		for (int i = 0; i < nums.length; i++) {
			Set<Integer> even = new HashSet<>();
			Set<Integer> odd = new HashSet<>();

			for (int j = i; j < nums.length; j++) {
				if (nums[j] % 2 == 0) {
					even.add(nums[j]);
				} else {
					odd.add(nums[j]);
				}

				if (even.size() == odd.size()) {
					maxLen = Math.max(maxLen, j - i + 1);
				}
			}
		}
		return maxLen;

	}
}
