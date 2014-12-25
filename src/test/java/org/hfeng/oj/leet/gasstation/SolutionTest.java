package org.hfeng.oj.leet.gasstation;

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
    public void testCanCompleteCircuit() throws Exception {
        int[] g1 = new int[]{4};
        int[] c1 = new int[]{5};
        int e1 = -1;
        int[] g2 = new int[]{4};
        int[] c2 = new int[]{5};
        int e2 = 0;

        assertEquals(e1, solution.canCompleteCircuit(g1, c1));
        assertEquals(e1, solution.canCompleteCircuit(g2, c2));

    }
}
