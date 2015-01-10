package org.hfeng.oj.leet.reverselinkedlisttwo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

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
        ListNode h1 = createListFromArray(new int[] {1, 2, 3, 4, 5});
        int m1 = 2;
        int n1 = 4;
        ListNode e1 = createListFromArray(new int[] {1, 4, 3, 2, 5});
        ListNode r1 = solution.reverseBetween(h1, m1, n1);
        assertEqualList(r1, e1);

    }

    private ListNode createListFromArray(int[] array) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        for (int i = 0; i < array.length; i++) {
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        return tmp.next;
    }

    private void assertEqualList(ListNode left, ListNode right) {
        while (left != null && right != null) {
            assertEquals(left.val, right.val);
            left = left.next;
            right = right.next;
        }
        assertNull(left);
        assertNull(right);
    }
}
