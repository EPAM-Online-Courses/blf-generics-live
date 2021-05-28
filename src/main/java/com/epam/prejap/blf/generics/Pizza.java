package com.epam.prejap.blf.generics;

/**
 * @author dam
 */
class Pizza {
    private PizzaType pizzaType;

    public Pizza(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
    @Override
    public String toString(){
        return this.pizzaType.toString();
    }
}
