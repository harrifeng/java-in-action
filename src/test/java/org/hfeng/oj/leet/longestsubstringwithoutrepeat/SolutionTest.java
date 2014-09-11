package org.hfeng.oj.leet.longestsubstringwithoutrepeat;

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
     * 
     * Method: lengthOfLongestSubstring(String s) 
     * 
     */ 
    @Test
    public void testLengthOfLongestSubstring() throws Exception {
        Solution solution = new Solution();
        assertEquals(12, solution.lengthOfLongestSubstring("wlrbbmqbhcdarzowkkyhiddqscdxrjmowfrxsjybldbefsarcbynecdyggxxpklorellnmpapqfwkhopkmco"));
    } 

} 
