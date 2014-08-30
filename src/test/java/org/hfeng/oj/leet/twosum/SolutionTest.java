package org.hfeng.oj.leet.twosum;


import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.Assert.*;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: twoSum(int[] numbers, int target)
     */
    @Test
    public void testTwoSum() throws Exception {

        Solution solution = new Solution();
        int[] n1 = {2, 7, 11, 15};
        int t1 = 9;
        int[] r1 = {1, 2};

        int [] n2 = {5,75,25};
        int t2 = 100;
        int [] r2 = {2, 3};

        int [] n3 = {3, 2, 4};
        int t3 = 6;
        int [] r3 = {2, 3};
        assertArrayEquals(r1, solution.twoSum(n1, t1));
        assertArrayEquals(r2, solution.twoSum(n2, t2));
        assertArrayEquals(r3, solution.twoSum(n3, t3));
    }

} 
