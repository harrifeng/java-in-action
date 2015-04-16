package org.hfeng.oj.leet.rotatelist;

import org.hfeng.oj.leet.util.*;
public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null || n <= 0) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        ListNode last = dummy;
        int len = 0;

        while (last.next != null) {
            len++;
            last = last.next;
        }

        last.next = head;

        int k = len - (n % len);

        ListNode tmp = dummy;
        for (int i = 0; i < k; i++) {
            tmp = tmp.next;
        }

        ListNode ret = tmp.next;
        tmp.next = null;
        return ret;
    }
}
