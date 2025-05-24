package org.example.factory.simplefactory;

import org.example.factory.simplefactory.model.Pizza;

public class VeggiePizza extends Pizza {
    public VeggiePizza(String name) {
        super(name);
        System.out.println("VeggiePizza created");
    }
}
