package org.hfeng.oj.leet.binarytreelevelordertraversal;

import org.hfeng.oj.leet.util.TreeNode;
import org.hfeng.oj.leet.util.TreeNodeHelper;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {
    Solution solution;

    @Before
    public void before() throws Exception {
        solution = new Solution();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testLevelOrder() throws Exception {
        TreeNode t1 = TreeNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7});
        List<Integer> p11 = new ArrayList<Integer>(Arrays.asList(new Integer[]{1}));
        List<Integer> p12 = new ArrayList<Integer>(Arrays.asList(new Integer[]{2, 3}));
        List<Integer> p13 = new ArrayList<Integer>(Arrays.asList(new Integer[]{4, 5, 6, 7}));
        List<List<Integer>> e1 = new ArrayList<List<Integer>>();
        e1.add(p11);
        e1.add(p12);
        e1.add(p13);

        assertEquals(e1, solution.levelOrder(t1));
    }
}
