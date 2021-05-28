package com.epam.prejap.blf.generics;

/**
 * @author dam
 */
class Restaurant {
    private String name;
    private DeliverCompany deliverCompany;

    public Restaurant(String name, DeliverCompany deliverCompany) {
        this.name = name;
        this.deliverCompany = deliverCompany;
    }

    public void makePizza(PizzaType pizzaType, Client client) {
        Box box = new Box(new Pizza(pizzaType));
        deliverCompany.deliver(box, client);
    }

    public void makeBurger(BurgerType burgerType, Client client){
        Box box = new Box(new Burger(burgerType));
        deliverCompany.deliver(box, client);
    }



}
