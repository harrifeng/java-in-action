package org.hfeng.oj.leet.copylistwithrandompointer;

import org.hfeng.oj.leet.util.*;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        RandomListNode tmp = head;
        while (head != null) {
            RandomListNode oldNext = head.next;
            head.next = new RandomListNode(head.label);
            head.next.next = oldNext;
            //head.next.random = head.random;
            head = oldNext;
        }
        head = tmp;
        while (head != null) {
            head.next.random = head.random == null ? null : head.random.next;
            head = head.next.next;
        }

        RandomListNode start = new RandomListNode(-1);
        RandomListNode ret = start;
        while (tmp != null) {
            start.next = tmp.next;
            start = start.next;
            tmp.next = tmp.next.next;
            tmp = tmp.next;
        }
        start.next = null;
        return ret.next;
    }
}
