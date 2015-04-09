package org.hfeng.misc.test;

public class TestInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int num = 5;
        sb.insert(0, num + '0');
        System.out.println(sb.toString());
    }
}
