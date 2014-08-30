package org.hfeng.tij4.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Groups {
    static public final String POEM = "Twas brilling, and the slithy toves\n" +
            "Did gyre and gimble in the wabe. \n" +
            "All mimsy were the borogoves.\n" +
            "The frumious Bandersnatch.";

    public static void main(String[] args) {
        Matcher m = Pattern.compile("(?m)(\\S+)\\s+((\\S+)\\s+(\\S+))$").matcher(POEM);
        while (m.find()) {
            for (int i = 0; i <= m.groupCount(); i++) {
                System.out.println("[" + m.group(i) + "]" );
            }
            System.out.println();
        }
    }
}
