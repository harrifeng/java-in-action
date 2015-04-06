package org.hfeng.oj.leet.removenthfromendoflist;

import org.hfeng.oj.leet.util.ListNode;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        if (head == null) {
            return null;
        }

        ListNode front = head;

        for (int i = 0; i < n; i++) {
            if (front == null) {
                return null;
            }
            front = front.next;
        }

        // Remove the first one
        if (front == null) {
            return head.next;
        }

        ListNode back = head;
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }
        back.next = back.next.next;
        return head;
    }
}
