package org.hfeng.oj.leet.reorderlist;

import org.hfeng.oj.leet.util.ListNode;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // minor half need to be reversed.
        ListNode mid = slow.next;
        // reverse list will be in pre after finish
        ListNode pre = null;

        ListNode last = mid;
        while (last != null) {
            ListNode next = last.next;
            last.next = pre;
            pre = last;
            last = next;
        }
        slow.next = null;

        while(head!= null && pre != null) {
            ListNode nextH = head.next;
            ListNode nextP = pre.next;

            head.next = pre;
            pre.next = nextH;
            head = nextH;
            pre = nextP;
        }
    }
}
