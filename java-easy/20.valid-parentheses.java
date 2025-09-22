/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public boolean isValid(String s) {

        Deque<Character> stack = new ArrayDeque<>(s.length());

        for(char bracket : s.toCharArray()) {

            switch (bracket) {
                case '(', '{', '[' -> stack.push(bracket);
                default -> {
                    if (stack.isEmpty())
                        return false;

                    char top = stack.pop();
                    if (!matches(top, bracket))
                        return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public boolean matches(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
// @lc code=end

