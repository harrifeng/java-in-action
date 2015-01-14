package org.hfeng.oj.leet.quicksort;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
    Solution solution;

    @Before
    public void before() throws Exception {
        solution = new Solution();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testQuickSort() throws Exception {
        int[] a1 = new int[] {1, 3, 4, 5, 9, 2, 14, 7, 8};
        int[] e1 = new int[] {1, 2, 3, 4, 5, 7, 8, 9, 14};
        solution.quickSort(a1);
        assertArrayEquals(e1, a1);
    }
}
