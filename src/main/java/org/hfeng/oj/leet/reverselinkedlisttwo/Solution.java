package org.hfeng.oj.leet.reverselinkedlisttwo;

import org.hfeng.oj.leet.util.*;

public class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode pre = new ListNode(-1);
        pre.next = head;
        ListNode ret = pre;

        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }
        head = pre.next;

        for (; m < n; m++) {
            //////////////////////////////////////////////////////
            // do remember on ListNode first show on the right, //
            // then on the left                                 //
            //////////////////////////////////////////////////////
            ListNode tmp = head.next;
            head.next = tmp.next;
            tmp.next = pre.next;
            pre.next = tmp;
        }
        return ret.next;
    }
}
