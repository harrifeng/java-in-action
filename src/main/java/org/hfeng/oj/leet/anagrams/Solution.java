package org.hfeng.oj.leet.anagrams;

import java.util.*;

public class Solution {
    public List<String> anagrams(String[] strs) {
        List<String> ret = new ArrayList<String>();

        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < strs.length; i++) {
            if (map.containsKey(sortChars(strs[i]))) {
                ret.add(strs[i]);
            } else {
                map.put(sortChars(strs[i]), strs[i]);
            }
        }

        for (int i = 0; i < ret.size(); i++) {
            if (map.containsKey(sortChars(ret.get(i)))) {
                ret.add(map.get(sortChars(ret.get(i))));
                map.remove(sortChars(ret.get(i)));
            }
        }
        return ret;
    }

    private String sortChars(String str) {
        char[] content = str.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
