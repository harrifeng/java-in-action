package org.hfeng.oj.leet.removeduplicatefromsortedlist;

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
    public void testDeleteDuplicate() throws Exception {
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 1, 2, 3, 3});
        ListNode e1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3});
        ListNodeHelper.assertEqualList(e1, solution.deleteDuplicate(h1));
    }
}
