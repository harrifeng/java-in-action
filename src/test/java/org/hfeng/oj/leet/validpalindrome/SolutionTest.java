package org.hfeng.oj.leet.validpalindrome;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
        assertTrue(solution.isPalindrome(""));
        assertTrue(solution.isPalindrome("abcdcba"));
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("race a car"));
    }


}
