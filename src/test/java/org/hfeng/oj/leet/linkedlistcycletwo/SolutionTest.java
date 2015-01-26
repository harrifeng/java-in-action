package org.hfeng.oj.leet.linkedlistcycletwo;

import org.hfeng.oj.leet.util.ListNode;
import org.hfeng.oj.leet.util.ListNodeHelper;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
        ListNode e1 = null;

        assertEquals(e1, solution.detectCycle(h1));

        ListNode h2 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3});
        ListNode tmp = h2;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = h2;

        ListNode e2 = h2;
        assertEquals(e2, solution.detectCycle(h2));

        ListNode h3 = ListNodeHelper.createListFromArray(new int[]{1, 2, 3});
        tmp = h3;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        tmp.next = h3.next;

        ListNode e3 = tmp.next;
        assertEquals(e3, solution.detectCycle(h3));
    }
}
