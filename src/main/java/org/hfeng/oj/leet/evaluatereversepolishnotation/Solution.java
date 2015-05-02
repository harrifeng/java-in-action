package org.hfeng.oj.leet.evaluatereversepolishnotation;

import java.util.Stack;
import java.util.Arrays;
public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<String>();
        String[] op = new String[] {"+", "-", "*", "/"};

        for (int i = 0; i < tokens.length(); i++) {
            if (Arrays.binarySearch(op, tokens[i]) > -1 ) {
                //operator
            }
        }

        return 9;
    }
}
