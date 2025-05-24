package org.example.factory.factory.models;

import org.example.factory.simplefactory.model.Pizza;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza(String name) {
        super(name);
        System.out.println("ChicagoVeggiePizza created");
    }
}
