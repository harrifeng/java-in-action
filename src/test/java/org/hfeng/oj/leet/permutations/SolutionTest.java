package org.hfeng.oj.leet.permutations;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: atoi(String str)
     */
    @Test
    public void testPermutations() throws Exception {
        int[] t1 = new int[]{1, 2, 3};
        List<Integer> l1 = new ArrayList<Integer>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        List<Integer> l2 = new ArrayList<Integer>();
        l2.add(1);
        l2.add(3);
        l2.add(2);
        List<Integer> l3 = new ArrayList<Integer>();
        l3.add(2);
        l3.add(1);
        l3.add(3);
        List<Integer> l4 = new ArrayList<Integer>();
        l4.add(2);
        l4.add(3);
        l4.add(1);
        List<Integer> l5 = new ArrayList<Integer>();
        l5.add(3);
        l5.add(1);
        l5.add(2);
        List<Integer> l6 = new ArrayList<Integer>();
        l6.add(3);
        l6.add(2);
        l6.add(1);

        List<List<Integer>> e1 = new ArrayList<List<Integer>>();
        e1.add(l1);
        e1.add(l2);
        e1.add(l3);
        e1.add(l4);
        e1.add(l5);
        e1.add(l6);
        Solution solution = new Solution();
        System.out.println(l1);
        System.out.println(l5);
        System.out.println(e1);
        assertThat("ArrayList equeals", e1, containsInAnyOrder(solution.permute(t1).toArray()));
    }
}
