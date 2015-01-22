package org.hfeng.oj.leet.copylistwithrandompointer;

import org.hfeng.oj.leet.util.RandomListNode;

public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {

        // insert nodes
        RandomListNode cur = head;
        while (cur != null) {
            RandomListNode tmp = new RandomListNode(cur.label);
            tmp.next = cur.next;
            cur.next = tmp;
            cur = tmp.next;
        }

        // copy random pointer
        cur = head;
        while (cur != null) {
            RandomListNode tmp = cur.next;
            if (cur.random != null) {
                tmp.random = cur.random.next;
            }

            cur = tmp.next;
        }

        // decouple two links

        cur = head;
        RandomListNode dup = head == null ? null : head.next;

        while (cur != null) {
            RandomListNode tmp = cur.next;
            cur.next = tmp.next;
            if (tmp.next != null) {
                tmp.next = tmp.next.next;
            }
            cur = cur.next;
        }
        return dup;
    }
}
