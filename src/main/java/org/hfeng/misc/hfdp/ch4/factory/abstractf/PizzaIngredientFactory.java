package org.hfeng.misc.hfdp.ch4.factory.abstractf;

public interface PizzaIngredientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Clam createClam();
}
