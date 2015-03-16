package org.hfeng.oj.leet.graycode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
        if (n == 0) {
            List<Integer> ret = new ArrayList<Integer>();
            ret.add(0);
            return ret;
        }

        List<Integer> ret = grayCode(n - 1);
        int adder = 1 << (n - 1);
        int orgLen = ret.size();
        for (int i = orgLen - 1; i >= 0; i--) {
            ret.add(ret.get(i) + adder);
        }
        return ret;
    }
}
