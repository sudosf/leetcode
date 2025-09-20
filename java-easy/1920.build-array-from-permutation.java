/*
 * @lc app=leetcode id=1920 lang=java
 *
 * [1920] Build Array from Permutation
 */

// @lc code=start

class Solution {
  public int[] buildArray(int[] nums) {

    int len = nums.length;
    for (int i = 0; i < len; i++) {
      int original = nums[i] % len;
      nums[i] = original + ((nums[nums[i]] % len) * len);
    }

    for (int i = 0; i < len; i++) {
      nums[i] = nums[i] / len;
    }

    return nums;
  }
}
// @lc code=end

