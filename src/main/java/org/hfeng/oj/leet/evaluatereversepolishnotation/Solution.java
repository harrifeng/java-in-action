package org.hfeng.oj.leet.evaluatereversepolishnotation;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<String> opList = new ArrayList<String>();
        opList.add("+");
        opList.add("-");
        opList.add("*");
        opList.add("/");

        for (int i = 0; i < tokens.length; i++) {
            int opt = opList.indexOf(tokens[i]);
            if (opt > -1) {
                //operator
                int right = stack.pop();
                int left = stack.pop();
                switch (opt) {
                    case 0:
                        stack.push(left + right);
                        break;
                    case 1:
                        stack.push(left - right);
                        break;
                    case 2:
                        stack.push(left * right);
                        break;
                    case 3:
                        stack.push(left / right);
                        break;
                }
            } else {
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
