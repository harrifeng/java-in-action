package org.hfeng.oj.leet.climbingstairs;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
    public void testGetPermutation() throws Exception {
        int t1 = 5;
        int e1 = 8;
        int t2 = 15;
        int e2 = 987;
        int t3 = 39;
        int e3 = 102334155;
        assertEquals(e1, solution.climbStairs(t1));
        assertEquals(e2, solution.climbStairs(t2));
        assertEquals(e3, solution.climbStairs(t3));
    }
}
