package com.epam.prejap.blf.generics;

class Main {
    public static void main(String[] args) {
        Client client = new Client("Damian", "532-312-412", "Daszynskiego 7");
        Restaurant restaurant = new Restaurant("Mega-pizza");
         restaurant.makeOrder("margerita", client);
    }
}

