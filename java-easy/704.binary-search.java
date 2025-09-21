/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start

import java.util.Arrays;

class Solution {
  public int search(int[] nums, int target) {

    int index = Arrays.binarySearch(nums, target);
    
    return index < 0 ? -1 : index;
  }

  int baseBinarySearch(int[] nums, int target) {
    int left = 0;
    int right = nums.length - 1;

    while (left <= right) {
      int mid = (left + right) / 2;

      if (nums[mid] == target) {
        return mid;
      } else if (nums[mid] < target) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }

    return -1;
  }
}
// @lc code=end

