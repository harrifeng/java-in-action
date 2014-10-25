package org.hfeng.oj.leet.trappingrainwater;

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
    public void testTrap() throws Exception {
        int[] arr1 = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, solution.trap(arr1));
        int[] arr2 = new int[] {0, 2, 0};
        assertEquals(0, solution.trap(arr2));
        int[] arr3 = new int[] {2, 0, 2};
        assertEquals(2, solution.trap(arr3));
    }
}
