package org.hfeng.misc.hfdp.ch4.factory.abstractf;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

    public Dough createDough() {
        return new ThinCrustDough();
    }
    public Sauce createSauce() {
        return new MarinaraSauce();
    }
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }
    public Clam createClam() {
        return new FrozenClam();
    }
}
