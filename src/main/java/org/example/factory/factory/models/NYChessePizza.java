package org.example.factory.factory.models;

import org.example.factory.simplefactory.model.Pizza;

public class NYChessePizza extends Pizza {
    public NYChessePizza(String name) {
        super(name);
        System.out.println("NYCheesePizza created");
    }
}
