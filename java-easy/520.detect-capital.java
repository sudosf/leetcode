
/*
 * @lc app=leetcode id=520 lang=java
 *
 * [520] Detect Capital
 */

// @lc code=start

class Solution {
    public boolean detectCapitalUse(String word) {
        return word.matches("[A-Z]+|[a-z]+|[A-Z][a-z]*");
    }
}
// @lc code=end

