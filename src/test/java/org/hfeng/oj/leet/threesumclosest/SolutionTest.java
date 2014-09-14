package org.hfeng.oj.leet.threesumclosest;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;
    @Before
    public void before() throws Exception {
        solution = new Solution();
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testThreeSumClosest() throws Exception {
        assertEquals(2, solution.threeSumClosest(new int[] {-1, 2, 1, -4}, 1));
        assertEquals(3, solution.threeSumClosest(new int[] {1, 1, 1, 0 }, 100));
        assertEquals(0, solution.threeSumClosest(new int[] {0, 0, 0 }, 1));
        assertEquals(3, solution.threeSumClosest(new int[] {0, 1, 2 }, 3));
        assertEquals(1, solution.threeSumClosest(new int[] {0, 5, -1, -2, 4, -1, 0, -3, 4, -5}, 1));
        assertEquals(0, solution.threeSumClosest(new int[] {0, 2, 1, -3 }, 1));
        assertEquals(-2, solution.threeSumClosest(new int[] {4, 0, 5, -5, 3, 3, 0, -4, -5}, -2));
        assertEquals(-2, solution.threeSumClosest(new int[]{-3, -2, -5, 3, -4}, -1));
    }
}
