package com.epam.prejap.blf.generics;

/**
 * @author dam
 */
class Pizza {
    private String pizzaName;

    public Pizza(String pizzaName) {

        this.pizzaName = pizzaName;
    }
    public String toString(){
        return this.pizzaName;
    }
}
