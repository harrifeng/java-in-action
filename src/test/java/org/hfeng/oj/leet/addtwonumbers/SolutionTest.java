package org.hfeng.oj.leet.addtwonumbers;

import org.hfeng.oj.leet.util.ListNode;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.*;


public class SolutionTest {

    Solution solution;

    @Before
    public void before() throws Exception {
        solution = new Solution();
    }

    @After
    public void after() throws Exception {
    }

    private ListNode createList(int[] arr) {
        ListNode hd = new ListNode(-1);
        ListNode tp = hd;
        for (int i = 0; i < arr.length; i++) {
            hd.next = new ListNode(arr[i]);
            hd = hd.next;
        }
        return tp.next;
    }

    private void useTreeArrays(int[]aa, int[]bb, int[]result) {

        ListNode ha = createList(aa);
        ListNode hb = createList(bb);
        ListNode ret = solution.addTwoNumbers(ha, hb);
        int i = 0;
        while(ret != null && i < result.length) {
            assertEquals(result[i], ret.val);
            ret = ret.next;
            i++;
        }
        assertTrue("List finish", ret == null);
        assertTrue("Array finish", i == result.length);
    }
    /**
     * Method: addTwoNumbers(ListNode l1, ListNode l2)
     */

    @Test
    public void testAddTwoNumbers() throws Exception {

        int[] a1 = {1, 3, 5, 7};
        int[] b1 = {2, 3, 6, 8};
        int[] r1 = {3, 6, 1, 6, 1};
        useTreeArrays(a1, b1, r1);

        int[] a2 = {1, 8};
        int[] b2 = {0};
        int[] r2 = {1,8};
        useTreeArrays(a2, b2, r2);
    }
}

