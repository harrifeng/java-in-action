package org.hfeng.oj.leet.binarytreepostordertraversal;

import java.util.*;

import org.hfeng.oj.leet.util.TreeNode;

public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode tmp = root;
        boolean leftDone = false;
        boolean rightDone = false;

        while (!stack.empty() || tmp != null) {
            if (tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            } else {
                if (rightDone) {
                    tmp = stack.pop();
                    ret.add(tmp.val);
                    stack.pop();
                } else {
                    tmp = stack.peek().right;
                    rightDone = true;
                }
            }
        }
        return ret;
    }
}
