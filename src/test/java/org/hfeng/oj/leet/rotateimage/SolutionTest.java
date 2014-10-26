package org.hfeng.oj.leet.rotateimage;

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
    public void testRotateImage() throws Exception {
        int[][] m1 = new int[][] { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] r1 = new int[][] { {7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        solution.rotate(m1);
        assertEquals(r1, m1);
    }
}
