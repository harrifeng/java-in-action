package org.hfeng.oj.leet.simplifypath;

import org.hfeng.book.tij4.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> s = new Stack<String>();
        String[] split = path.split("/");
        for (String a : split) {
            if (!a.equals(".") && !a.isEmpty()) {
                if (a.equals("..")) {
                    if (!s.empty()) {
                        s.pop();
                    }
                } else {
                    s.push(a);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!s.empty()) {
            sb.insert(0, s.pop());
            sb.insert(0, "/");
        }
        return sb.length() == 0 ? "/" : sb.toString();
    }
}
