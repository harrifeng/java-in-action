package org.hfeng.oj.leet.reorderlist;

import org.hfeng.oj.leet.util.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }

        ListNode tmp = head;
        while (tmp.next.next != null) {
            tmp = tmp.next;
        }

        ListNode headNext = head.next;

        head.next = tmp.next;
        head.next.next = headNext;
        tmp.next = null;

        reorderList(headNext);
    }
}
