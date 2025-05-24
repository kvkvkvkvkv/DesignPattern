package org.example.factory.simplefactory;

import org.example.factory.simplefactory.model.Pizza;

public class PepperoniPizza extends Pizza {
    public PepperoniPizza(String name) {
        super(name);
        System.out.println("Pepperoni pizza created");
    }
}
