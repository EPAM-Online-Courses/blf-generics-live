package com.epam.prejap.blf.generics;

/**
 * @author Wojciech Kolarczyk
 **/
class Box {
    private Pizza pizza;
    private Burger burger;

    public Box(Pizza pizza) {

        this.pizza = pizza;
    }

    public Box(Burger burger) {
        this.burger = burger;
    }

    public Pizza open() {
        return pizza;
    }
}
