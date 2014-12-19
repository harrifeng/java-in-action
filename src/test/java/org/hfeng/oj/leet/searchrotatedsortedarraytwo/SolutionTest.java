package org.hfeng.oj.leet.searchrotatedsortedarraytwo;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
    public void testSearch() throws Exception {
        int[] a1 = {5, 1, 3};
        int t1 = 3;
        assertTrue(solution.search(a1, t1));

        int[] a2 = {1, 3, 5, 5, 5, 6, 6, 7};
        int t2 = 2;
        assertFalse(solution.search(a2, t2));

        int[] a3 = {1};
        int t3 = 0;
        assertFalse(solution.search(a3, t3));

        int[] a4 = {1};
        int t4 = 1;
        assertTrue(solution.search(a4, t4));

        int[] a5 = {1, 3, 1, 1, 1};
        int t5 = 3;
        assertTrue(solution.search(a5, t5));

    }
}
