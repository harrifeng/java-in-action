package org.hfeng.oj.leet.partitionlist;

import org.hfeng.oj.leet.util.*;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode small = new ListNode(-1);
        ListNode smallTmp = small;

        ListNode large = new ListNode(-1);
        ListNode largeTmp = large;

        ListNode tmp = head;

        while (head != null) {
            if (head.val < x) {
                small.next = head;
                small = small.next;
            } else {
                large.next = head;
                large = large.next;
            }
            head = head.next;
        }
        small.next = largeTmp.next;
        large.next = null;
        return smallTmp.next;
    }
}
