package org.hfeng.book.jcip.ch4;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TestUnmodified {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        Map<String, String> umap = Collections.unmodifiableMap(map);
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");

        System.out.println(umap.get("1"));
        map.put("1", "A");
        System.out.println(umap.get("1"));
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// a                                              //
// A                                              //
////////////////////////////////////////////////////
