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
        assertEquals(4, solution.longestConsecutive(a1));
    }
}
