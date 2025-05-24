package org.example.factory.abstractfactory.models;

import org.example.factory.simplefactory.model.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(String name) {
        super(name);
        System.out.println("ChicagoCheesePizza created");
    }
}
