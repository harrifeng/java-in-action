package org.hfeng.oj.leet.removenthfromendoflist;

import org.hfeng.oj.leet.util.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode after = head;
        ListNode before = head;

        for (int i = 0; i < n; i++) {
            after = after.next;
        }

        // remove the first node!
        if (after == null) {
            dummy.next = dummy.next.next;
            return dummy.next;
        }

        // here you can say after has next
        while (after.next != null) {
            after = after.next;
            before = before.next;
        }

        before.next = before.next.next;

        return dummy.next;

    }
}