package org.example.factory.simplefactory;

import org.example.factory.simplefactory.model.Pizza;

public class CheesePizza extends Pizza {
    public CheesePizza(String name) {
        super(name);
        System.out.println("CheesePizza created");
    }
}
