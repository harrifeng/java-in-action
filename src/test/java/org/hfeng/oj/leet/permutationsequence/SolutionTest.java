package org.hfeng.oj.leet.permutationsequence;
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
    public void testGetPermutation() throws Exception {
        assertEquals("123", solution.getPermutation(3, 1));
//        assertEquals("213", solution.getPermutation(3, 3));
    }
}
