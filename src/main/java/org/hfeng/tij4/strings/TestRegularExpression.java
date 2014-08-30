package org.hfeng.tij4.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
    public static void main(String[] args) {
        //        if (args.length < 2) {
        //            System.out.println("Uage:\n java TestRegularExpression" +
        //                    "characterSequence regularExpression+");
        //            System.exit(0);
        //        }
        String[] ags = new String[2];
        ags[0] = "abcabcabcdefabc";
        ags[1] = "abc+";

        System.out.println("Input: \"" + ags[0] + "\"");
        for (String arg : ags) {

            System.out.println("Regular expression: \"" + arg + "\"");
            Pattern p = Pattern.compile(arg);
            Matcher m = p.matcher(ags[0]);

            while (m.find()) {
                System.out.println("Match \"" + m.group() + "\" at position" +
                        m.start() + " - " + (m.end() - 1));
            }
        }
    }
}
