package org.hfeng.book.dpj.ch2.adapter.extend;

public class PrintBanner extends Banner implements Print{
    public PrintBanner(String string) {
        super(string);
    }

    public void printWeak() {
        showWithParen();
    }

    public void printStrong() {
        showWithAster();
    }
}
