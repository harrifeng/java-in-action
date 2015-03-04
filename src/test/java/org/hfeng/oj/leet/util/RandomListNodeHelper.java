package org.hfeng.oj.leet.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class RandomListNodeHelper {
    public static RandomListNode createListFramArray(int[] array) {
        RandomListNode head = new RandomListNode(-1);
        RandomListNode tmp = head;
        for (int i = 0; i < array.length; i++) {
            head.next = new RandomListNode(array[i]);

            head = head.next;
        }

        head = tmp;
        while (head != null) {
            head.random = head.next == null ? null : head.next.next;
            head = head.next;
        }
        return tmp.next;
    }

    public static void assertEqualList(RandomListNode left, RandomListNode right) {
        while (left != null && right != null) {
            assertEquals(left.label, right.label);
            assertTrue((left.random == null && right.random == null) || (left.random.label == right.random.label));
            left = left.next;
            right = right.next;
        }
        assertNull(left);
        assertNull(right);
    }
}
