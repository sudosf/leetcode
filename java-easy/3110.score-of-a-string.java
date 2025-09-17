/*
 * @lc app=leetcode id=3110 lang=java
 *
 * [3110] Score of a String
 */

// @lc code=start
class Solution {
  public int scoreOfString(String s) {
    int[] asciiArray = s.chars().toArray();

    int sum = 0;
    for (int i = 0; i < asciiArray.length - 1; i++) {
      sum += Math.abs(asciiArray[i] - asciiArray[i + 1]);
    }

    return sum;
  }
}
// @lc code=end

