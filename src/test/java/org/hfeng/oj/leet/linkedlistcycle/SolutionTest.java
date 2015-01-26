package org.hfeng.oj.leet.linkedlistcycle;

import org.hfeng.oj.leet.util.ListNode;
import org.hfeng.oj.leet.util.ListNodeHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;


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
    public void testHashCycle() throws Exception {
        ListNode h1 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3, 4});
        assertFalse(solution.hasCycle(h1));

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3});
        ListNode tmp = h2;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = h2;
        assertTrue(solution.hasCycle(h2));
    }
}
