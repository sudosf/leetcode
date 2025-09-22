/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char bracket = s.charAt(i);

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

        return stack.empty();
    }

    public boolean matches(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}')
                || (open == '[' && close == ']');
    }
}
// @lc code=end

