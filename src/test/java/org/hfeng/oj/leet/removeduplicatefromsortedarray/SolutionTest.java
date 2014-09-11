package org.hfeng.oj.leet.removeduplicatefromsortedarray;

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
    public void testRemoveDuplicates() throws Exception {
        int[] a1 = { 1, 1, 2};
        int[] r1 = {1, 2};
        int[] a2 = {1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 6, 7, 8, 8, 9, 10};
        int[] r2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        arrayResult(a1, r1);
        arrayResult(a2, r2);
    }

    private void arrayResult(int[] array, int[] result) {
        assertEquals(result.length, solution.removeDuplicates(array));
        assertArrayEquals(result, Arrays.copyOf(array, result.length));
    }
}
