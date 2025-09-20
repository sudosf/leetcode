/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
  public int search(int[] nums, int target) {

    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == target) {
        return i;
      }
    }

    return -1; // Not found
  }
}
// @lc code=end

