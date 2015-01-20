package org.hfeng.book.jcip.ch5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        //ConcurrentHashMap
        Map<String, String> myMap = new ConcurrentHashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
        System.out.println("ConcurrentHashMap before iterator" + myMap);

        Iterator<String> it = myMap.keySet().iterator();

        while (it.hasNext()) {
            String key = it.next();
            if (key.equals("3")) {
                myMap.put(key + "new", "new3");
            }
        }
        System.out.println("ConcurrentHashMap after iterator" + myMap);

        //HashMap
        myMap = new HashMap<String, String>();
        myMap.put("1", "1");
        myMap.put("2", "2");
        myMap.put("3", "3");
        System.out.println("HashMap before iterator" + myMap);
        Iterator<String> it1 = myMap.keySet().iterator();

        while (it1.hasNext()) {
            String key = it1.next();
            if (key.equals("3")) {
                myMap.put(key + "new", "new3");
            }
        }
        System.out.println("HashMap after iterator" + myMap);
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
// <===================OUTPUT===================>                                                    //
// ConcurrentHashMap before iterator{1=1, 3=3, 2=2}                                                  //
// ConcurrentHashMap after iterator{3new=new3, 1=1, 3=3, 2=2}                                        //
// HashMap before iterator{3=3, 2=2, 1=1}                                                            //
// java.lang.reflect.InvocationTargetException                                                       //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)                                   //
// 	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)                 //
// 	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)         //
// 	at java.lang.reflect.Method.invoke(Method.java:606)                                              //
// 	at org.codehaus.mojo.exec.ExecJavaMojo$1.run(ExecJavaMojo.java:293)                              //
// 	at java.lang.Thread.run(Thread.java:745)                                                         //
// Caused by: java.util.ConcurrentModificationException                                              //
// 	at java.util.HashMap$HashIterator.nextEntry(HashMap.java:922)                                    //
// 	at java.util.HashMap$KeyIterator.next(HashMap.java:956)                                          //
// 	at org.hfeng.book.jcip.ch5.ConcurrentHashMapExample.main(ConcurrentHashMapExample.java:36)       //
// 	... 6 more                                                                                       //
///////////////////////////////////////////////////////////////////////////////////////////////////////
