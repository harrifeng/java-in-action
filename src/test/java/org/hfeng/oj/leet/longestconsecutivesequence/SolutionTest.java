package org.hfeng.oj.leet.longestconsecutivesequence;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

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
    public void testLongestConsecutive() throws Exception {
        int[] a1 = {100, 4, 200, 1, 3, 2};
        int r1 = 4;
        assertEquals(r1, solution.longestConsecutive(a1));

        int[] a2 = {1, 2, 0, 1};
        int r2 = 3;
        assertEquals(r2, solution.longestConsecutive(a2));

        int[] a3 = {1, 3, 5, 2, 4};
        int r3 = 5;
        assertEquals(r3, solution.longestConsecutive(a3));
    }
}
