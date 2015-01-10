package org.hfeng.oj.leet.partitionlist;

import org.hfeng.oj.leet.util.*;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode(-1);
        ListNode leftMark = left;
        ListNode right = new ListNode(-1);
        ListNode rightMark = right;

        while (head != null) {
            if (head.val < x) {
                left.next = head;
                left = head;
            } else {
                right.next = head;
                right = head;
            }
            head = head.next;
        }

        left.next = rightMark.next;
        // Do remember to null the last one
        right.next = null;
        return leftMark.next;
    }
}
