package org.hfeng.oj.leet.lengthoflastword;

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
        String s1 = "hello world";
        int e1 = 5;
        assertEquals(e1, solution.lengthOfLastWord(s1));
        String s2 = "a b     ";
        int e2 = 1;
        assertEquals(e2, solution.lengthOfLastWord(s2));
    }
}
