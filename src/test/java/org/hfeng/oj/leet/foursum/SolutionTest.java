package org.hfeng.oj.leet.foursum;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;


public class SolutionTest {

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    @Test
    public void testFourSum() throws Exception {

        Solution solution = new Solution();
        int num1[] = {1, 0, -1, 0, -2, 2};
        int target1 = 0;
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        a1.add(-1);
        a1.add(0);
        a1.add(0);
        a1.add(1);
        ArrayList<Integer> a11 = new ArrayList<Integer>();
        a11.add(-2);
        a11.add(-1);
        a11.add(1);
        a11.add(2);
        ArrayList<Integer> a12 = new ArrayList<Integer>();
        a12.add(-2);
        a12.add(0);
        a12.add(0);
        a12.add(2);

        ArrayList<ArrayList<Integer>> expected1 = new ArrayList<ArrayList<Integer>>();
        expected1.add(a1);
        expected1.add(a11);
        expected1.add(a12);
        System.out.println("expected: " + expected1);
        System.out.println("actually: " + solution.fourSum(num1, target1));
        assertThat("ArrayList equal", expected1, containsInAnyOrder(
                solution.fourSum(num1, target1).toArray()));
        ////////////
        // TEST 2 //
        ////////////
        int num2[] = {-1, 0, 1, 2, -1, 4};
        int target2 = -1;
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(-1);
        a2.add(-1);
        a2.add(0);
        a2.add(1);

        ArrayList<ArrayList<Integer>> expected2 = new ArrayList<ArrayList<Integer>>();
        expected2.add(a2);
        System.out.println("expected: " + expected2);
        System.out.println("actually: " + solution.fourSum(num2, target2));
        assertThat("ArrayList equal", expected2, containsInAnyOrder(
                solution.fourSum(num2, target2).toArray()));

        ////////////
        // TEST 3 //
        ////////////
        int num3[] = {-3, -1, 0, 2, 4, 5};
        int target3 = 2;
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(-3);
        a3.add(-1);
        a3.add(2);
        a3.add(4);

        ArrayList<ArrayList<Integer>> expected3 = new ArrayList<ArrayList<Integer>>();
        expected3.add(a3);
        System.out.println("expected: " + expected3);
        System.out.println("actually: " + solution.fourSum(num3, target3));
        assertThat("ArrayList equal", expected3, containsInAnyOrder(
                solution.fourSum(num3, target3).toArray()));
    }
}
