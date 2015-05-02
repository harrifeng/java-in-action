package org.hfeng.oj.leet.evaluatereversepolishnotation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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
        String[] t1 = new String[]{"2", "1", "+", "3", "*"};
        int e1 = 9;

        String[] t2 = new String[]{"4", "13", "5", "/", "+"};
        int e2 = 6;

        assertEquals(e1, solution.evalRPN(t1));
        assertEquals(e2, solution.evalRPN(t2));
    }
}
