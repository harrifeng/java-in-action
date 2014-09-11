package org.hfeng.oj.leet.regularexpressionmatching;

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

    /**
     * Method: isMatch(String s, String p)
     */
    @Test
    public void testIsMatch() throws Exception {
        assertFalse(solution.isMatch("aa", "a"));
        assertFalse(solution.isMatch("aaa", "a"));

        assertTrue(solution.isMatch("aa", "aa"));
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("aaa", "a*a"));
        assertTrue(solution.isMatch("ab", ".*"));
        assertTrue(solution.isMatch("aab", "c*a*b"));
        assertTrue(solution.isMatch("a", "."));
        assertTrue(solution.isMatch("bbba", ".*a*a"));
        assertFalse(solution.isMatch("ab", ".*c"));
        assertFalse(solution.isMatch("aa", "."));
        assertFalse(solution.isMatch("acaabbaccbbacaabbbb", "a*.*b*.*a*aa*a*"));

    }
}
