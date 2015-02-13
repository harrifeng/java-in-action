package org.hfeng.oj.leet.simplifypath;

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
    public void testSimplifyPath() throws Exception {
        assertEquals("/home", solution.simplifyPath("/home"));
        assertEquals("/c", solution.simplifyPath("/a/./b/../../c/"));
        assertEquals("/", solution.simplifyPath("/../"));
        assertEquals("/home/foo", solution.simplifyPath("/home//foo/"));
    }
}
