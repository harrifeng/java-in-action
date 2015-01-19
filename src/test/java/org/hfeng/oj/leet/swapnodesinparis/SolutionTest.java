package org.hfeng.oj.leet.swapnodesinparis;

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
    public void testDeleteDuplicates() throws Exception {
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 4});
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{2, 1, 4, 3});
        ListNodeHelper.assertEqualList(e1, solution.swapPairs(h1));

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3});
        ListNode e2 = ListNodeHelper.createListFromArray(new int[]{2, 1, 3});
        ListNodeHelper.assertEqualList(e2, solution.swapPairs(h2));
    }
}
