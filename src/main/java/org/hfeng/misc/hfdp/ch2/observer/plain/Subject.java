package org.hfeng.misc.hfdp.ch2.observer.plain;

public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
