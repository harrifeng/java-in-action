package org.hfeng.oj.leet.reverseinteger;

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

    /**
     * Method: reverse(int x)
     */
    @Test
    public void testReverse() throws Exception {
        //TODO: Test goes here...
        Solution solution = new Solution();
        assertEquals(12345, solution.reverse(54321));
        assertEquals(1, solution.reverse(1));
        assertEquals(0, solution.reverse(0));
        assertEquals(-1234, solution.reverse(-4321));
    }

}
