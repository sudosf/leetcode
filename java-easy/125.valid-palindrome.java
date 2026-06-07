/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        return twoPointerApproach(s);
    }

    public boolean regexApproach(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    public boolean twoPointerApproach(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (!Character.isLetterOrDigit(s.charAt(start))) {
                start++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(end))) {
                end--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(start)) 
                != Character.toLowerCase(s.charAt(end)))
            {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}
// @lc code=end

