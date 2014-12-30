package org.hfeng.oj.leet.singlenumer;

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
    public void testConvert() throws Exception {
        int[] a1 = new int[]{1, 2, 2, 1, 3, 4, 5, 3, 4};
        int e1 = 5;
        int[] a2 = new int[]{1, 12, 2, 1, 3, 4, 5, 3, 4, 2, 5};
        int e2 = 12;
        assertEquals(e1, solution.singleNumber(a1));
        assertEquals(e2, solution.singleNumber(a2));
    }
}
