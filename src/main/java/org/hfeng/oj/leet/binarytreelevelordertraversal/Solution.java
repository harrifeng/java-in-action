package org.hfeng.oj.leet.binarytreelevelordertraversal;

import org.hfeng.oj.leet.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        List<Integer> one = new ArrayList<Integer>();
        one.add(root.val);
        ret.add(one);

        List<List<Integer>> leftRet = levelOrder(root.left);
        List<List<Integer>> rightRet = levelOrder(root.right);

        int len = Math.max(leftRet.size(), rightRet.size());
        for (int i = 0; i < len; i++) {
            List<Integer> zero = new ArrayList<Integer>();
            if (leftRet.size() > i) {
                zero.addAll(leftRet.get(i));
            }
            if (rightRet.size() > i) {
                zero.addAll(rightRet.get(i));
            }
            ret.add(zero);
        }
        return ret;
    }
}
