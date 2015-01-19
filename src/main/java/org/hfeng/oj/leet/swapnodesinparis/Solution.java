package org.hfeng.oj.leet.swapnodesinparis;

import org.hfeng.oj.leet.util.ListNode;

class Solution {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tmp = dummy;
        ListNode before = head;
        ListNode after = head.next;

        while (after != null) {
            head = after.next;
            after.next = before;
            before.next = head;
            dummy.next = after;

            dummy = before;
            before = head;
            after = (head == null) ? null : head.next;
        }

        return tmp.next;
    }
}