package org.example.factory.abstractfactory.models;

import org.example.factory.simplefactory.model.Pizza;

import javax.xml.namespace.QName;

public class ChicagoVeggiePizza extends Pizza {
    public ChicagoVeggiePizza(String name) {
        super(name);
        System.out.println("ChicagoVeggiePizza created");
    }
}
