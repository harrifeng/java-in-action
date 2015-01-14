package org.hfeng.oj.leet.partitionlist;

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
    public void testPartition() throws Exception {
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 4, 3, 2, 5, 2});
        int v1 = 3;
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 2, 4, 3, 5});
        ListNodeHelper.assertEqualList(e1, solution.partition(h1, v1));
    }
}
