package com.epam.prejap.blf.generics;

/**
 * @author dam
 */
class Client {
    private final String name;
    private final String phoneNumber;
    private final String address;

    public Client(String name, String phoneNumber, String address) {

        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public void receivePizza(Pizza pizza) {
        System.out.println(pizza);
    }
}
