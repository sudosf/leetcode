/*
 * @lc app=leetcode id=3110 lang=java
 *
 * [3110] Score of a String
 */


// @lc code=start
class Solution {
  public int scoreOfString(String s) {

    int sum = 0;
    int len = s.length() - 1;
    for (int i = 0; i < len; i++) {
      sum += Math.abs(s.charAt(i) - s.charAt(i + 1));
    }

    return sum;
  }
}
// @lc code=end

