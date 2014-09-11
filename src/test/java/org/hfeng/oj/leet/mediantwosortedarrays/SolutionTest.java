package org.hfeng.oj.leet.mediantwosortedarrays;

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
     * Method: findMedianSortedArrays(int A[], int B[])
     */
    @Test
    public void testFindMedianSortedArrays() throws Exception {
        Solution solution = new Solution();
        int[] a = {1, 2};
        int[] b = {1, 1};
        final float delta = 0.0001F;
        assertEquals(1.0, solution.findMedianSortedArrays(a, b), delta);
    }

}
