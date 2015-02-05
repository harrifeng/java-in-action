package org.hfeng.oj.leet.anagrams;

import org.hamcrest.collection.IsIterableContainingInOrder;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertArrayEquals;
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
    public void testAnagrams() throws Exception {
        String[] a1 = new String[]{"paw", "dad", "bog", "alert", "alter", "mig", "len", "rat", "later"};
        List<String> e1 = Arrays.asList(new String[]{"alert", "alter", "later"});
        assertThat(solution.anagrams(a1), containsInAnyOrder(e1.toArray()));


        String[] a2 = new String[]{"tea", "and", "ate", "eat", "den"};
        List<String> e2 = Arrays.asList(new String[]{"tea", "ate", "eat"});
        assertThat(solution.anagrams(a2), containsInAnyOrder(e2.toArray()));
    }
}
