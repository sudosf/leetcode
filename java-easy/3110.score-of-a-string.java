/*
 * @lc app=leetcode id=3110 lang=java
 *
 * [3110] Score of a String
 */


// @lc code=start
class Solution {
  public int scoreOfString(String s) {

    int sum = 0;
    int prev = s.charAt(0);
    int len = s.length();
    for (int i = 1; i < len; i++) {
      sum += Math.abs(prev - s.charAt(i));
      prev = s.charAt(i);
    }

    return sum;
  }
}
// @lc code=end

