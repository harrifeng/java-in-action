package org.hfeng.book.dpj.ch1.iterator;

public class Book {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "";

    public Book(String name) {
        this.name = name;
    }
}
