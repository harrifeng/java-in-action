package org.hfeng.oj.leet.implementstrstr;

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
    public void testConvert() throws Exception {
        String input1 = "abc";
        String input2 = "abc";
        int e1 = 0;
        assertEquals(e1, solution.strStr(input1, input2));
    }
}
