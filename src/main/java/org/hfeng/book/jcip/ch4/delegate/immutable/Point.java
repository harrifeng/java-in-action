package org.hfeng.book.jcip.ch4.delegate.immutable;

import org.apache.http.annotation.ThreadSafe;

@ThreadSafe
public class Point {
    public final int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
