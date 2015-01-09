package org.hfeng.misc.jpie.ch4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {
    public static List<Integer> quickSort(List<Integer> numbers) {
        if (numbers.size() < 2) {
            return numbers;
        }

        final Integer pivot = numbers.get(0);
        final List<Integer> lower = new ArrayList<Integer>();
        final List<Integer> higher = new ArrayList<Integer>();

        for (int i = 1; i < numbers.size(); i++) {
            if (numbers.get(i) < pivot) {
                lower.add(numbers.get(i));
            } else {
                higher.add(numbers.get(i));
            }
        }
        final List<Integer> sorted = quickSort(lower);
        sorted.add(pivot);
        sorted.addAll(quickSort(higher));
        return sorted;
    }

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(new Integer[] {1, 21, 3, 34, 2, 23});
        System.out.println(quickSort(input));
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// [1, 2, 3, 21, 23, 34]                          //
////////////////////////////////////////////////////
