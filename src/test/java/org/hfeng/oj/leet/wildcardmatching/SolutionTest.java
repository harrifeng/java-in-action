package org.hfeng.oj.leet.wildcardmatching;

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
    public void testIsMatch() throws Exception {
        assertFalse(solution.isMatch("aa", "a"));
        assertFalse(solution.isMatch("aaa", "a"));
        assertFalse(solution.isMatch("aab", "c*a*b"));
        assertFalse(solution.isMatch("aa", "?"));
        assertFalse(solution.isMatch("aaabbbaabaaaaababaabaaabbabbbbbbbbaabababbabbbaaaaba", "a*******b"));

        assertTrue(solution.isMatch("aa", "aa"));
        assertTrue(solution.isMatch("aa", "a*"));
        assertTrue(solution.isMatch("aaa", "a*a"));
        assertTrue(solution.isMatch("ab", "?*"));
        assertTrue(solution.isMatch("a", "?"));
    }
}
