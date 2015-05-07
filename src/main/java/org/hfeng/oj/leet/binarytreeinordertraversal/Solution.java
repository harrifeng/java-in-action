package org.hfeng.oj.leet.binarytreeinordertraversal;

import java.util.*;

import org.hfeng.oj.leet.util.TreeNode;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Map<TreeNode, Boolean> map = new HashMap<TreeNode, Boolean>();
        List<Integer> ret = new ArrayList<Integer>();

        if (root == null) {
            return ret;
        }

        stack.push(root);

        while (!stack.empty()) {
            TreeNode now = stack.pop();

            if (now.left == null) {
                ret.add(now.val);
                map.put(now, true);
                if (now.right != null) {
                    stack.push(now.right);
                }
            } else if (map.containsKey(now.left) && map.get(now.left)) {
                ret.add(now.val);
                map.put(now, true);
            } else {
                if (now.right != null) {
                    stack.push(now.right);
                }
                stack.push(now);
                if (now.left != null) {
                    stack.push(now.left);
                }
            }
        }
        return ret;
    }
}
