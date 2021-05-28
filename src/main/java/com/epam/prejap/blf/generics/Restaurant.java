package com.epam.prejap.blf.generics;

/**
 * @author dam
 */
class Restaurant {
    private String name;

    public Restaurant(String name) {
        this.name = name;
    }

    public void makeOrder(String pizzaName, Client client) {
        client.receivePizza(new Pizza(pizzaName));
    }
}
