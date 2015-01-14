package org.hfeng.oj.leet.rotatelist;
import org.hfeng.oj.leet.util.*;

public class Solution {
    public ListNode rotateRight(ListNode head, int n) {
        if (head == null || head.next == null) {
            return head;
        }
        int len = 1;
        ListNode tmp = head;
        while (tmp.next != null) {
            len++;
            tmp = tmp.next;
        }
        n %= len;
        int k = len - n;
        tmp.next = head;
        for (int i = 0; i < k; i++) {
            tmp = tmp.next;
        }
        ListNode ret = tmp.next;
        tmp.next = null;
        return ret;
    }
}
