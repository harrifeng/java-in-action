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
        stack.push(tmp);
        TreeNode pre = null;

        while (!stack.empty()) {
            if ((pre == null || pre.left == stack.peek() || pre.right == stack.peek())
                    && stack.peek().left != null) {
                pre = stack.peek();
                stack.push(stack.peek().left);
            } else if (((stack.peek().left == null && pre != stack.peek().right) || pre == stack.peek().left)
                    && stack.peek().right != null) {
                pre = stack.peek();
                stack.push(stack.peek().right);
            } else {
                pre = stack.peek();
                stack.pop();
                ret.add(pre.val);
            }
        }
        return ret;
    }
}
