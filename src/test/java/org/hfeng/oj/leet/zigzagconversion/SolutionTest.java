package org.hfeng.oj.leet.zigzagconversion;

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

    /**
     * Method: convert(String s, int nRows)
     */
    @Test
    public void testConvert() throws Exception {
        assertEquals("PAHNAPLSIIGYIR", solution.convert("PAYPALISHIRING", 3));
        assertEquals("ACB", solution.convert("ABC", 2));
        assertEquals("A", solution.convert("A", 1));
        assertEquals("AB", solution.convert("AB", 1));
    }


} 
