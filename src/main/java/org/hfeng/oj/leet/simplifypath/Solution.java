package org.hfeng.oj.leet.simplifypath;

import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<String>();
        String[] parts = path.split("/");
        for (int i = 0; i< parts.length; i++) {
            if (!parts[i].isEmpty() &&!parts[i].equals(".")) {
                if (parts[i].equals((".."))) {
                    if (!stack.empty()) {
                        stack.pop();
                    }
                } else {
                    stack.push(parts[i]);
                }
            }
        }

        StringBuilder ret = new StringBuilder();
        while (!stack.empty()) {
            ret.insert(0, stack.pop());
            ret.insert(0, "/");
        }
        return ret.length() == 0 ? "/" : ret.toString();
    }
}
