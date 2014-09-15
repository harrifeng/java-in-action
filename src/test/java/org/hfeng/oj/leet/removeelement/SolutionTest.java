package org.hfeng.oj.leet.removeelement;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
    public void testRemoveElement() throws Exception {
        int[] a1 = {1, 2, 3, 4, 5};
        int   t1 = 2;
        int[] r1 = {1, 3, 4, 5};

        int[] a2 = {11, 12, 12, 21, 13, 14, 15, 11, 11};
        int   t2 = 11;
        int[] r2 = {12, 12, 12, 21, 13, 14, 15};

        arrayResult(a1, t1, r1);
    }

    private void arrayResult(int[] array, int target, int[] result) {
        assertEquals(result.length, solution.removeElement(array, target));
        assertArrayEquals(result, Arrays.copyOf(array, result.length));
    }
}
