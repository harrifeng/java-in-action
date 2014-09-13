package org.hfeng.oj.leet.searchrotatedsortedarray;

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
    public void testSearch() throws Exception {
        int[] a1 = { 4, 5, 6, 7, 1, 2, 3};
        int t1 = 6;
        int r1 = 2; 
        assertEquals(r1, solution.search(a1, t1));

        int[] a2 = { 1, 3, 5 };
        int t2 = 3;
        int r2 = 1;
        assertEquals(r2, solution.search(a2, t2));

        int[] a3 = { 5, 1, 3 };
        int t3 = 3;
        int r3 = 2;
        assertEquals(r3, solution.search(a3, t3));

        int[] a4 = { 3, 1};
        int t4 = 1;
        int r4 = 1;
        assertEquals(r4, solution.search(a4, t4));
        
    }
} 

