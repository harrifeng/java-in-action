package org.hfeng.misc.jdp.ch2.question4;

public class Main {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Alice", "Alaska");

        System.out.println("userinfo = " + userInfo);

        StringBuffer info = userInfo.getInfo();
        info.replace(12, 13, "Bobby");

        System.out.println("userinfo = " + userInfo);
    }
}
