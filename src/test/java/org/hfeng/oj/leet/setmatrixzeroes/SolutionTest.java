package org.hfeng.oj.leet.setmatrixzeroes;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

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
    public void testSetZero() throws Exception {
        int[][] t1 = new int[][] {{0, 2}, {3, 4}, {5, 6}};
        int[][] e1 = new int[][] {{0, 0}, {0, 4}, {0, 6}};
        int[][] t2 = new int[][] {{1, 2, 3}, {4, 0, 6}, {7, 8, 9}};
        int[][] e2 = new int[][] {{1, 0, 3}, {0, 0, 0}, {7, 0, 9}};
        solution.setZeroes(t1);
        for (int i = 0; i < e1.length; i++) {
            assertArrayEquals(e1[i], t1[i]);
        }
    }
}
