package org.example.factory.factory.models;

import org.example.factory.simplefactory.model.Pizza;

public class ChicagoCheesePizza extends Pizza {
    public ChicagoCheesePizza(String name) {
        super(name);
        System.out.println("ChicagoCheesePizza created");
    }
}
