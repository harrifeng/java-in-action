package org.hfeng.oj.leet.anagrams;

import java.util.*;

public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> ret = new ArrayList<String>();
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(formalOrder(strs[i]))) {
                ret.add(strs[i]);
            } else {
                map.put(formalOrder(strs[i]), strs[i]);
            }
        }

        for (int i = 0; i < ret.size(); i++) {
            if (map.containsKey(formalOrder(ret.get(i)))) {
                ret.add(map.get(formalOrder(ret.get(i))));
                map.remove(formalOrder(ret.get(i)));
            }
        }
        return ret;
    }

    private String formalOrder(String str) {

        int[] ret = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ret[i] = str.charAt(i) - 'a';
        }
        Arrays.sort(ret);
        StringBuilder pivot = new StringBuilder();
        for (int i = 0; i < ret.length; i++) {
            pivot.append(Integer.toString(ret[i] + 'a'));
        }
        return pivot.toString();
    }

}
