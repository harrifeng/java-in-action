package org.hfeng.oj.leet.addtwonumbers;

import org.hfeng.oj.leet.util.*;
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int adv = 0;
        ListNode head = new ListNode(-1);
        ListNode tmp = head;
        while (l1 != null || l2 != null) {
            int v1 = (l1 == null) ? 0 : l1.val;
            int v2 = (l2 == null) ? 0 : l2.val;
            int sum = adv + v1 + v2;
            head.next = new ListNode(sum % 10);
            head = head.next;
            adv = sum / 10;
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
        }
        if (adv == 1) {
            head.next = new ListNode(1);
        }
        return tmp.next;
    }
}
