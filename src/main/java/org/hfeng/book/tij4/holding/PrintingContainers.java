package org.hfeng.book.tij4.holding;

import java.util.*;

public class PrintingContainers {
    static Collection fill(Collection<String> collection) {
        collection.add("rat");
        collection.add("cat");
        collection.add("dog");
        collection.add("dog");
        return collection;
    }

    static Map fill(Map<String, String> map) {
        map.put("rat", "fuzzy");
        map.put("cat", "rags");
        map.put("dog", "bosco");
        map.put("dog", "spot");
        return map;
    }

    public static void main(String[] args) {
        System.out.println(fill(new ArrayList<String>()));
        System.out.println(fill(new LinkedList<String>()));
        System.out.println(fill(new HashSet<String>()));
        System.out.println(fill(new TreeSet<String>()));
        System.out.println(fill(new LinkedHashSet<String>()));
        System.out.println(fill(new HashMap<String, String>()));
        System.out.println(fill(new TreeMap<String, String>()));
        System.out.println(fill(new LinkedHashMap<String, String>()));
    }
}

/////////////////////////////////////////////////////
// <===================output===================>  //
// [rat, cat, dog, dog]                            //
// [rat, cat, dog, dog]                            //
// [cat, dog, rat]                                 //
// [cat, dog, rat]                                 //
// [rat, cat, dog]                                 //
// {cat=rags, dog=spot, rat=fuzzy}                 //
// {cat=rags, dog=spot, rat=fuzzy}                 //
// {rat=fuzzy, cat=rags, dog=spot}                 //
/////////////////////////////////////////////////////
