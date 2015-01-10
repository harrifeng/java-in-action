package org.hfeng.oj.leet.reverselinkedlisttwo;

import org.hfeng.oj.leet.util.*;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(-1);
        ListNode p = dummy;
        dummy.next = head;

        for (int i = 1; i < m; i++) {
            p = p.next;
        }
        head = p.next;

        for (; m < n; m++) {
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = p.next;
            p.next = tmp;
        }
        return dummy.next;
    }
}
