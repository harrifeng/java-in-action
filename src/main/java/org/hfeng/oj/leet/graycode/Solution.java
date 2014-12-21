package org.hfeng.oj.leet.graycode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ret = new ArrayList<Integer>();
        ret.add(0);
        for (int i = 0; i < n; i++) {
            final int highest_bit = 1 << i;
            for (int j = ret.size() - 1; j >= 0; j--) {
                ret.add(highest_bit | ret.get(j));
            }
        }
        return ret;
    }
}
