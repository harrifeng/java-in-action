package org.hfeng.oj.leet.addbinary;

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
    public void testAddBinary() throws Exception {
        String a1 = "11";
        String b1 = "1";
        String e1 = "100";
        assertEquals(e1, solution.addBinary(a1, b1));

        String a2 = "1000";
        String b2 = "1";
        String e2 = "1001";
        assertEquals(e2, solution.addBinary(a2, b2));
    }
}
