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

    /**
     * Method: convert(String s, int nRows)
     */
    @Test
    public void testConvert() throws Exception {
        int[] a1 = { 4, 5, 6, 7, 1, 2, 3};
        int t1 = 6;
        int r1 = 2; 
        assertEquals(r1, solution.search(a1, t1));
    }
} 

