package org.hfeng.book.dpj.ch4.factory.idcard;

import org.hfeng.book.dpj.ch4.factory.framework.Factory;
import org.hfeng.book.dpj.ch4.factory.framework.Product;

import java.util.Vector;

public class IDCardFactory extends Factory {
    private Vector owners = new Vector();
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }
    protected void registerProduct(Product product) {
        owners.add(((IDCard)product).getOwner());
    }
    public Vector getOwners() {
        return owners;
    }
}
