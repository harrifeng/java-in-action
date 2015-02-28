package org.hfeng.book.dpj.ch6.prototype.framework;

public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}
