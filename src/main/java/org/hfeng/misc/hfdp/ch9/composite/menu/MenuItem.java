package org.hfeng.misc.hfdp.ch9.composite.menu;

public class MenuItem extends MenuComponent {
    String name;
    String description;
    boolean vegetarian;
    double price;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public MenuItem(String name,
                    String description,
                    boolean vegetarian,
                    double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public void print() {
        System.out.println(" " + getName());
        if (isVegetarian()) {
            System.out.print("(v),");
        }
        System.out.println(getPrice());
        System.out.println(">>-- " + getDescription());
    }
}
