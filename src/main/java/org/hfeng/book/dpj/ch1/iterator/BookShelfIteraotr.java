package org.hfeng.book.dpj.ch1.iterator;

public class BookShelfIteraotr implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIteraotr(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        this.index = 0;
    }

    public boolean hasNext() {
        if (index < bookShelf.getLength()) {
            return true;
        } else {
            return false;
        }
    }

    public Object next() {
        Book book = bookShelf.getBookAt(index);
        index++;
        return book;
    }
}
