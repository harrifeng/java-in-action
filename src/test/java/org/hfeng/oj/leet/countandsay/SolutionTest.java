package org.hfeng.oj.leet.countandsay;

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
    public void testCountAndSay() throws Exception {
        int n1 = 2;
        String e1 = "11";
        assertEquals(e1, solution.countAndSay(n1));

        int n2 = 5;
        String e2 = "111221";
        assertEquals(e2, solution.countAndSay(n2));

        int n3 = 11;
        String e3 = "11131221133112132113212221";
        assertEquals(e3, solution.countAndSay(n3));
    }
}
