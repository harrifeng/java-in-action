package org.hfeng.misc.test;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Solution {
    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter(".\\util\\log.txt");
            PrintWriter pw = new PrintWriter(file);
            pw.write("hello");
            pw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
