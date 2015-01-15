package org.hfeng.jcip.ch4;

import org.apache.http.annotation.NotThreadSafe;

@NotThreadSafe
public class MutablePoint {
    public double x, y;

    public MutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public MutablePoint(MutablePoint p) {
        this(p.x, p.y);
    }
}
