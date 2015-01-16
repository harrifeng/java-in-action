package org.hfeng.oj.leet.graycode;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;
import java.util.List;

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
    public void testGrayCode() throws Exception {
        int t1 = 2;
        List<Integer> e1 = Arrays.asList(0, 1, 3, 2);
        List<Integer> e2 = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4);
        List<Integer> e3 = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4, 12, 13, 15, 14, 10, 11, 9, 8);
        assertEquals(e1, solution.grayCode(2));
        assertEquals(e2, solution.grayCode(3));
        assertEquals(e3, solution.grayCode(4));
    }
}
