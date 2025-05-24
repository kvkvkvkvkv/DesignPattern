package org.example.factory.abstractfactory.models;

import org.example.factory.simplefactory.model.Pizza;

public class NYChessePizza extends Pizza {
    public NYChessePizza(String name) {
        super(name);
        System.out.println("NYCheesePizza created");
    }
}
