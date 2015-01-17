package org.hfeng.oj.leet.removeduplicatefromsortedlisttwo;

import org.hfeng.oj.leet.util.ListNode;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode tmp = dummy;

        ListNode before = head;
        ListNode after = head.next;

        while (after != null) {
            if (before.val != after.val) {
                dummy.next = before;
                dummy = dummy.next;
                before = after;
                after = after.next;
            } else {
                int value = before.val;
                while (before != null && before.val == value) {
                    before = before.next;
                }
                if (before == null) {
                    dummy.next = null;
                    return tmp.next;
                }

                if (before.next == null){
                    dummy.next = before;
                    return  tmp.next;
                }
                after = before.next;
            }
        }
        return tmp.next;
    }
}
