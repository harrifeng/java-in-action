package org.hfeng.oj.leet.palindromenumber;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: isPalindrome(int x)
     */
    @Test
    public void testIsPalindrome() throws Exception {
        Solution solution = new Solution();
        assertTrue(solution.isPalindrome(1221));
        assertTrue(solution.isPalindrome(12321));
        assertTrue(solution.isPalindrome(1));

        assertFalse(solution.isPalindrome(-2147483648));
        assertFalse(solution.isPalindrome(10));
        assertFalse(solution.isPalindrome(122));
        assertFalse(solution.isPalindrome(10091));
        assertFalse(solution.isPalindrome(10000021));
    }
}

