package org.hfeng.oj.leet.removenthfromendoflist;

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
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 4, 5});
        int n1 = 2;
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 5});
        ListNodeHelper.assertEqualList(e1, solution.removeNthFromEnd(h1, n1));

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{1});
        int n2 = 1;
        ListNode e2 = ListNodeHelper.createListFromArray(new int[]{});
        ListNodeHelper.assertEqualList(e2, solution.removeNthFromEnd(h2, n2));

    }
}
