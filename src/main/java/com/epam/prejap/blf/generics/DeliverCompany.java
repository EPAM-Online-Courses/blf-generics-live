package com.epam.prejap.blf.generics;

/**
 * @author Wojciech Kolarczyk
 **/
class DeliverCompany {

    public void deliver(Box box, Client client) {
        client.receive(box);
    }
}
