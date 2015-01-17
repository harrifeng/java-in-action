package org.hfeng.oj.leet.removeduplicatefromsortedlisttwo;

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
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 5});
        ListNodeHelper.assertEqualList(e1, solution.deleteDuplicates(h1));

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{1, 1});
        ListNode e2 = ListNodeHelper.createListFromArray(new int[]{});
        ListNodeHelper.assertEqualList(e2, solution.deleteDuplicates(h2));

        ListNode h3 = ListNodeHelper.createListFromArray(new int[]{1, 2, 2});
        ListNode e3 = ListNodeHelper.createListFromArray(new int[]{1});
        ListNodeHelper.assertEqualList(e3, solution.deleteDuplicates(h3));
    }
}
