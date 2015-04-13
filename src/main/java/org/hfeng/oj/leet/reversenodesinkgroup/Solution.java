package org.hfeng.oj.leet.reversenodesinkgroup;

import org.hfeng.oj.leet.util.*;

public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (k < 2 || head == null || head.next == null) {
            return head;
        }

        ListNode newGroup = head;
        for (int i = 0; i < k; i++) {
            if (newGroup == null) {
                return head;
            }
            newGroup = newGroup.next;
        }

        ListNode newGroupHead = reverseKGroup(newGroup, k);

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        for (int i = 0; i < k - 1; i++) {
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = dummy.next;
            dummy.next = tmp;
        }
        head.next = newGroupHead;
        return dummy.next;
    }
}
