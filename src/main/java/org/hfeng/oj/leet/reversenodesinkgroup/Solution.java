package org.hfeng.oj.leet.reversenodesinkgroup;

import org.hfeng.oj.leet.util.ListNode;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k < 2) {
            return head;
        }

        ListNode nextGroup = head;
        for (int i = 0; i < k; i++) {
            if (nextGroup != null) {
                nextGroup = nextGroup.next;
            } else {
                return head;
            }
        }

        // nextGroup is the head of next group
        // newNextGroup is the new head of next group after reversion
        ListNode newNextGroup = reverseKGroup(nextGroup, k);
        ListNode prev = null;
        ListNode cur = head;

        while (cur != nextGroup) {
            ListNode next = cur.next;
            cur.next = prev == null ? newNextGroup : prev;
            prev = cur;
            cur = next;
        }

        return prev; // prev will be new head of this group
    }
}
