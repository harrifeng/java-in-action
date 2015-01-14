package org.hfeng.oj.leet.rotatelist;

import org.hfeng.oj.leet.util.ListNode;
import org.hfeng.oj.leet.util.ListNodeHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


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
    public void testRotateRight() throws Exception {
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5});
        int v1 = 2;
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{4, 5, 1, 2, 3});
        ListNodeHelper.assertEqualList(e1, solution.rotateRight(h1, v1));

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{});
        int v2 = 2;
        ListNode e2 = ListNodeHelper.createListFromArray(new int[]{});
        ListNodeHelper.assertEqualList(e2, solution.rotateRight(h2, v2));

    }
}
