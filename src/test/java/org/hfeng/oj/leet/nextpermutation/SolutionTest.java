package org.hfeng.oj.leet.nextpermutation;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertArrayEquals;

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
    public void testNextPermutation() throws Exception {
        int[] arr1 = {1, 2, 3};
        solution.nextPermutation(arr1);
        int[] res1 = {1, 3, 2};
        assertArrayEquals(res1, arr1);

        int[] arr2 = {3, 2, 1};
        solution.nextPermutation(arr2);
        int[] res2 = {1, 2, 3};
        assertArrayEquals(res2, arr2);

        int[] arr3 = {3, 4, 1, 2};
        solution.nextPermutation(arr3);
        int[] res3 = {3, 4, 2, 1};
        assertArrayEquals(res3, arr3);

        int[] arr4 = {5,6,8,7,4,3,2,1};
        solution.nextPermutation(arr4);
        int[] res4 = {5,7,1,2,3,4,6,8};
        assertArrayEquals(res4, arr4);
    }
}
