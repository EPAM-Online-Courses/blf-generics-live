package com.epam.prejap.blf.generics;

class Main {
    public static void main(String[] args) {
        Client client = new Client("Damian", "532-312-412", "Daszynskiego 7");
        DeliverCompany deliverCompany = new DeliverCompany();
        Restaurant restaurant = new Restaurant("Mega-pizza", deliverCompany);
         restaurant.makePizza(PizzaType.MARGHERITA, client);

         restaurant.makeBurger(BurgerType.CHEESEBURGER, client);

    }
}

