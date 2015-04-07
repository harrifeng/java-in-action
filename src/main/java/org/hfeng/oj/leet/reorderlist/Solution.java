package org.hfeng.oj.leet.reorderlist;

import org.hfeng.oj.leet.util.*;
import java.util.*;

public class Solution {
    public void reorderList(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return ;
        }
        ListNode oneStep = head;
        ListNode twoStep = head;

        while (twoStep != null && twoStep.next != null) {
            twoStep = twoStep.next.next;
            oneStep = oneStep.next;
        }

        ListNode half = oneStep.next;
        oneStep.next = null;

        Stack<ListNode> stack = new Stack<ListNode>();
        while (half != null) {
            stack.push(half);
            half = half.next;
        }

        ListNode tmp = head;

        while (head != null) {
            ListNode oldRight = head.next;
            if (stack.empty()) {
                break;
            }
            head.next = stack.pop();
            head.next.next = oldRight;
            head = oldRight;
        }
        head = tmp;
    }
}
