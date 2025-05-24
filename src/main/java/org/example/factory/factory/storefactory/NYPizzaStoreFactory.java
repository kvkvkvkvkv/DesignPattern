package org.example.factory.factory.storefactory;

import org.example.factory.factory.models.NYChessePizza;
import org.example.factory.factory.models.NYVeggiePizza;
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
