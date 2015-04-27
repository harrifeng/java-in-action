package org.hfeng.oj.leet.validparentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') {
                stack.push(cur);
            } else {
                if (stack.empty()) {
                    return false;
                }

                if (stack.peek() == '(' && cur != ')') {
                    return false;
                }
                if (stack.peek() == '[' && cur != ']') {
                    return false;
                }
                if (stack.peek() == '{' && cur != '}') {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.empty();
    }
}
