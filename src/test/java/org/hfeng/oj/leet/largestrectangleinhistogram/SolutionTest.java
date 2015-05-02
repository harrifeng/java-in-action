package org.hfeng.oj.leet.largestrectangleinhistogram;

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
    public void testIsValidPalindrome() throws Exception {
        assertEquals(10, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        assertEquals(12, solution.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 6, 8}));
        assertEquals(16, solution.largestRectangleArea(new int[]{2, 3, 5, 6, 2, 1, 8, 14}));
        assertEquals(19, solution.largestRectangleArea(new int[]{2, 3, 3, 3, 3, 19}));
    }
}
