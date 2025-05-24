package org.example.factory.factory.storefactory;

import org.example.factory.factory.models.ChicagoCheesePizza;
import org.example.factory.factory.models.ChicagoVeggiePizza;
import org.example.factory.simplefactory.model.Pizza;

public class ChicagoPizzaStoreFactory extends PizzaStore {
    @Override
    public Pizza createPizza(String name) {
        if (name.equals("cheese")) {
            return new ChicagoCheesePizza(name);
        } else {
            return new ChicagoVeggiePizza("veggie");
        }
    }
}
