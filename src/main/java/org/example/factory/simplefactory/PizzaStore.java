package org.example.factory.simplefactory;

import lombok.AllArgsConstructor;
import org.example.factory.simplefactory.model.Pizza;

@AllArgsConstructor
public class PizzaStore {

    PizzaFactory pizzaFactory;

    public Pizza orderPizza(String name) {
        return pizzaFactory.createPizza(name);
    }
}
