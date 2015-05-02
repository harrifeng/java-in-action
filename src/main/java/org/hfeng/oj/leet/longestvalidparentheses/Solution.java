package org.hfeng.oj.leet.longestvalidparentheses;

import java.util.Stack;
public class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        int maxV = 0;
        int last = -1;

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur == '(') {
                stack.push(i);
            } else {
                if (stack.empty()) {
                    // no matching left
                    last = i;
                } else {
                    stack.pop();
                    if (stack.empty()) {
                        maxV = Math.max(maxV, i - last);
                    } else {
                        maxV = Math.max(maxV, i - stack.peek());
                    }
                }
            }
        }
        return maxV;
    }
}
