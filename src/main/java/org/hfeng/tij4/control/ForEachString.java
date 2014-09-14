package org.hfeng.tij4.control;

public class ForEachString {
    public static void main(String[] args) {
        for (char c : "An Afrian Swallow".toCharArray()) {
            System.out.printf(c + " ");
        }
    }
}

////////////////////////////////////////////////////
// <===================OUTPUT===================> //
// A n   A f r i a n   S w a l l o w              //
////////////////////////////////////////////////////
