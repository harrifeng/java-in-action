package org.hfeng.oj.leet.binarytreelevelordertraversaltwo;

import org.hfeng.oj.leet.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        if (root == null) {
            return ret;
        }
        List<Integer> one = new ArrayList<Integer>();
        one.add(root.val);

        List<List<Integer>> leftRet = levelOrderBottom(root.left);
        List<List<Integer>> rightRet = levelOrderBottom(root.right);

        int len = Math.max(leftRet.size(), rightRet.size());
        for (int i = leftRet.size() - len, j = rightRet.size() - len; (i < len && j < len); i++, j++) {
            List<Integer> zero = new ArrayList<Integer>();
            if (i >= 0) {
                zero.addAll(leftRet.get(i));
            }
            if (j >= 0) {
                zero.addAll(rightRet.get(j));
            }
            ret.add(zero);
        }

        ret.add(one);
        return ret;
    }
}
