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
        String input1a = "abc";
        String input1b = "abc";
        int e1 = 0;
        assertEquals(e1, solution.strStr(input1a, input1b));

        String input2a = "mississippi";
        String input2b = "issip";
        int e2 = 4;
        assertEquals(e2, solution.strStr(input2a, input2b));


        String input3a = "";
        String input3b = "";
        int e3 = 0;
        assertEquals(e3, solution.strStr(input3a, input3b));


        String input4a = "a";
        String input4b = "";
        int e4 = 0;
        assertEquals(e4, solution.strStr(input4a, input4b));
    }
}
