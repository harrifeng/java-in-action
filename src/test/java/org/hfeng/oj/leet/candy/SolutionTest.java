package org.hfeng.oj.leet.candy;

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
    public void testCandy() throws Exception {
        int e1 = 14;
        int[] r1 = new int[] {18, 1, 2, 3, 1, 4, 5};
        assertEquals(e1, solution.candy(r1));
        int e2 = 1;
        int[] r2 = new int[] {12};
        assertEquals(e2, solution.candy(r2));
        int e3 = 9;
        int[] r3 = new int[] {1, 2, 4, 4, 3};
        assertEquals(e3, solution.candy(r3));
    }
}
