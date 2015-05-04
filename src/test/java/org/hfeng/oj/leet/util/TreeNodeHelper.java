package org.hfeng.oj.leet.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class TreeNodeHelper {
    public static TreeNode createListFromArray(int[] array) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if (array.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        queue.offer(root);

        int count = 0;
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            if (++count < array.length) {
                cur.left = new TreeNode(array[count]);
                queue.offer(cur.left);
            } else {
                cur.left = null;
            }
            if (++count < array.length) {
                cur.right = new TreeNode(array[count]);
                queue.offer(cur.right);
            } else {
                cur.right = null;
            }
        }
        return root;
    }

    public static void assertEqualTree(TreeNode left, TreeNode right) {
        assertEquals(preOrderTree(left), preOrderTree(right));
    }

    public static List<Integer> preOrderTree(TreeNode root) {
        List<Integer> ret = new ArrayList<Integer>();
        preOrderSub(root, ret);
        return ret;
    }

    private static void preOrderSub(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        ret.add(root.val);
        if (root.left != null) {
            preOrderTree(root.left);
        }

        if (root.right != null) {
            preOrderTree(root.right);
        }
    }
}
