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
                /////////////////////////////////////////////////////////////
                // when tmp is null (and stack is not null), it means that //
                // 'one part' is finished! in recursive solution, it will  //
                // be the root == null and function will return to 'upper  //
                // level', in our non-recursive solution 'upper level'     //
                // correspond to stack.pop().                              //
                /////////////////////////////////////////////////////////////
                tmp = stack.pop();
                ret.add(tmp.val);
                tmp = tmp.right;
            }
        }
        return ret;
    }
}
