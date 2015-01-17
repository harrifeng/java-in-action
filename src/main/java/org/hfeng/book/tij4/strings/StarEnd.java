package org.hfeng.book.tij4.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnd {
    public static String input = "As long as ther is injustice, whenever a \n" +
            "Targathian baby cries out, wherever a distress\n" +
            "Never give up! Never surrender!";

    private static class Display {
        private boolean regexPrinted = false;
        private String regex;
        Display(String regex) {
            this.regex = regex;
        }

        void display(String message) {
            if (!regexPrinted) {
                System.out.println(regex);
                regexPrinted = true;
            }
            System.out.println(message);
        }
    }

    static void examine(String s, String regex) {
        Display d = new Display(regex);
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        while (m.find()) {
            d.display("find() ' " + m.group() + "' start="
                    + m.start() + " end =" + m.end());
        }
        if (m.lookingAt()) { // No reset() necessary
            d.display("LookingAt() start =" + m.start() + " end =" + m.end());
        }

        if (m.matches()) {
            d.display("matches() start =" + m.start() + " end = " + m.end());
        }
    }

    public static void main(String[] args) {
        for (String in : input.split("\n")) {
            System.out.println("input : " + in);
            for (String regex : new String[] { "\\w*ere\\w*",
            "\\w*ever", "T\\w+", "Never.*?!"}) {
                examine(in, regex);
            }
        }
    }

}