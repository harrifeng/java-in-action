package org.hfeng.oj.leet.longestvalidparentheses;

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
    public void testIsValidPalindrome() throws Exception {
        assertEquals(2, solution.longestValidParentheses("()"));
        assertEquals(4, solution.longestValidParentheses("(())("));
        assertEquals(6, solution.longestValidParentheses("()(((()))"));
        assertEquals(2, solution.longestValidParentheses("(()(((()"));
    }
}
