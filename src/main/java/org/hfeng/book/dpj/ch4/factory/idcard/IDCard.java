package org.hfeng.book.dpj.ch4.factory.idcard;

import org.hfeng.book.dpj.ch4.factory.framework.Product;

public class IDCard extends Product {
    private String owner;
    IDCard(String owner) {
        System.out.println("Created " + owner + "'s card");
        this.owner = owner;
    }
    public void use() {
        System.out.println("Use " + owner +"'s card");
    }
    public String getOwner() {
        return owner;
    }
}
