package org.hfeng.oj.leet.binarytreeinordertraversal;

import java.util.*;

import org.hfeng.oj.leet.util.TreeNode;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode tmp = root;

        while (!stack.empty() || tmp != null) {
            if (tmp != null) {
                stack.push(tmp);
                tmp = tmp.left;
            } else {
                tmp = stack.pop();
                ret.add(tmp.val);
                tmp = tmp.right;
            }
        }
        return ret;
    }
}
