///////////////////////////////////////////////////////////////////////////
// Be careful: a consecutive sequence length Need only be accurat at end //
///////////////////////////////////////////////////////////////////////////

package org.hfeng.oj.leet.longestconsecutivesequence;

import java.util.*;

public class Solution {
    public int longestConsecutive(int[] num) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int maxV = 0;
        for (int i = 0; i < num.length; i++) {
            int sum = 1;
            if (map.containsKey(num[i])) {
                continue;
            }

            if (map.containsKey(num[i] - 1)) {
                sum += map.get(num[i] - 1);
            }
            if (map.containsKey(num[i] + 1)) {
                sum += map.get(num[i] + 1);
            }

            if (map.containsKey(num[i] - 1)) {
                map.put(num[i] - map.get(num[i] - 1), sum);
            }
            if (map.containsKey(num[i] + 1)) {
                map.put(num[i] + map.get(num[i] + 1), sum);
            }

            map.put(num[i], sum);
            maxV = Math.max(maxV, sum);
        }
        return maxV;
    }
}
