package org.hfeng.oj.leet.binarytreepreordertraversal;

import java.util.*;

import org.hfeng.oj.leet.util.TreeNode;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        List<Integer> ret = new ArrayList<Integer>();

        if (root == null) {
            return ret;
        }

        stack.push(root);

        while (!stack.empty()) {
            TreeNode now = stack.pop();
            ret.add(now.val);
            // use Stack, please be aware that you should use right first!
            if (now.right != null) {
                stack.push(now.right);
            }
            if (now.left != null) {
                stack.push(now.left);
            }
        }
        return ret;
    }
}
