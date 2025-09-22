/*
 * @lc app=leetcode id=242 lang=java
 *
 * [242] Valid Anagram
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
     char[] arr1 = s.toCharArray();   
     char[] arr2 = t.toCharArray();
     
     Arrays.sort(arr1);
     Arrays.sort(arr2);

     return Arrays.equals(arr1, arr2);
    }
}
// @lc code=end

