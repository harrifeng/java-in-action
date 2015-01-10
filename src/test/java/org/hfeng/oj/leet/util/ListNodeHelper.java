package org.hfeng.oj.leet.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class ListNodeHelper {
    public static ListNode createListFromArray(int[] array) {
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        for (int i = 0; i < array.length; i++) {
            head.next = new ListNode(array[i]);
            head = head.next;
        }
        return tmp.next;
    }

    public static void assertEqualList(ListNode left, ListNode right) {
        while (left != null && right != null) {
            assertEquals(left.val, right.val);
            left = left.next;
            right = right.next;
        }
        assertNull(left);
        assertNull(right);
    }
}
