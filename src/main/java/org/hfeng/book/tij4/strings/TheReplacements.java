package org.hfeng.book.tij4.strings;

import java.util.regex.*;

public class TheReplacements {
    public static void main(String[] args) {
        String s = " /*! Here's a block of text to use as input to\n"
                   + "the regular expression matcher. Note that we'll\n"
                   + "first extract the block of text by looking for\n"
                   + "the special delimiters, then process the\n"
                   + "extracted block. !*/";
        // Match the specially commented block of text above:
        Matcher mInput = Pattern.compile("/\\*!(.*)!\\*/", Pattern.DOTALL).matcher(s);
        if (mInput.find()) {
            s = mInput.group(1); // Captured by parentheses
        }
        // Replace two or more spaces with a single space:
        s = s.replaceAll(" {2,}", " ");
        // Replace one or more spaces at the beginning of each
        // line with no spaces. Must enable MULTILINE mode:
        s = s.replaceAll("(?m)^ +", "");
        System.out.println(s);

        s = s.replaceFirst("[aeiou]", "(VOWEL1)");
        StringBuffer sbuf = new StringBuffer();
        Pattern p = Pattern.compile("[aeiou]");
        Matcher m = p.matcher(s);
        // Process the find information as you
        // perform the replacements:
        while (m.find()) {
            m.appendReplacement(sbuf, m.group().toUpperCase());
        }
        m.appendTail(sbuf);
        System.out.println(sbuf);
    }
}
