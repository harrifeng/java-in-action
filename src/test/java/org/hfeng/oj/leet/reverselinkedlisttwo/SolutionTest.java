package org.hfeng.oj.leet.reverselinkedlisttwo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import org.hfeng.oj.leet.util.*;

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
    public void testReverseBetween() throws Exception {
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5});
        int m1 = 2;
        int n1 = 4;
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{1, 4, 3, 2, 5});
        ListNode r1 = solution.reverseBetween(h1, m1, n1);
        ListNodeHelper.assertEqualList(r1, e1);

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5, 6, 7, 8});
        int m2 = 2;
        int n2 = 6;
        ListNode e2 = ListNodeHelper.createListFromArray(new int[]{1, 6, 5, 4, 3, 2, 7, 8});
        ListNode r2 = solution.reverseBetween(h2, m2, n2);
        ListNodeHelper.assertEqualList(r2, e2);

        ListNode h3 = ListNodeHelper.createListFromArray(new int[]{1, 2});
        int m3 = 1;
        int n3 = 2;
        ListNode e3 = ListNodeHelper.createListFromArray(new int[]{2, 1});
        ListNode r3 = solution.reverseBetween(h3, m3, n3);
        ListNodeHelper.assertEqualList(r3, e3);
    }
}
