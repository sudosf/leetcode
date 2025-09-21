/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
  public int[] twoSum(int[] nums, int target) {

    return hashTableApproach(nums, target);
  }

  /*
   * intuition: i will get to you, when i get to you
   */
  int[] bruteForceApproach(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      for (int k = 0; k < nums.length; k++) {
        if ((i != k) && (nums[i] + nums[k] == target)) {
          return new int[] {i, k};
        }
      }
    }

    return new int[] {};
  }

  /*
   * intuition: i've seen you before
   */
  int[] hashTableApproach(int[] nums, int target) {

    Map<Integer, Integer> seen = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];

      if (seen.containsKey(complement)) {
        return new int[] {seen.get(complement), i};
      }
      seen.put(nums[i], i);
    }

    return new int[] {};
  }

  /*
   * intuition: you are bigger/smaller than what i'm looking for...
   */
  int[] twoPointerApproach(int[] nums, int target) {

    Arrays.sort(nums);
    int left = 0;
    int right = nums.length - 1;

    while (left < right) {
      int sum = nums[left] + nums[right];

      if (sum == target) {
        return new int[] {left, right};
      } else if (sum < target) {
        left++;
      } else {
        right--;
      }
    }

    return new int[] {};
  }
}
// @lc code=end
