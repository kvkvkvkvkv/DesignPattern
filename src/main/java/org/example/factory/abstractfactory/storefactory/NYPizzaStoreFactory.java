package org.example.factory.abstractfactory.storefactory;

import org.example.factory.abstractfactory.models.NYChessePizza;
import org.example.factory.abstractfactory.models.NYVeggiePizza;
import org.example.factory.simplefactory.model.Pizza;

public class NYPizzaStoreFactory extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if (name.equals("cheese")) {
            return new NYChessePizza(name);
        } else {
            return new NYVeggiePizza("veggie");
        }
    }
}
