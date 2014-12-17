package org.hfeng.oj.leet.plusone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

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
        int[] t1 = new int[]{1, 2, 3};
        int[] e1 = new int[]{1, 2, 4};

        int[] t2 = new int[]{1, 9, 9, 9};
        int[] e2 = new int[]{2, 0, 0, 0};

        int[] t3 = new int[]{9, 9, 9};
        int[] e3 = new int[]{1, 0, 0, 0};
        assertArrayEquals(e1, solution.plusOne(t1));
        assertArrayEquals(e2, solution.plusOne(t2));
        assertArrayEquals(e3, solution.plusOne(t3));
    }
}
