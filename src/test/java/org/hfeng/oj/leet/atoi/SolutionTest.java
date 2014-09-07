package org.hfeng.oj.leet.atoi;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: atoi(String str)
     */
    @Test
    public void testAtoi() throws Exception {
        Solution solution = new Solution();
        assertEquals(0, solution.atoi(""));
        assertEquals(1234, solution.atoi("1234"));
        assertEquals(1, solution.atoi("+1"));
        assertEquals(-4321, solution.atoi("   -4321"));
        assertEquals(Integer.MAX_VALUE, solution.atoi("123456789999"));
        assertEquals(-2147483647, solution.atoi("-2147483647"));
    }
}

