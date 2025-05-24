package org.example.factory.abstractfactory.storefactory;

import org.example.factory.abstractfactory.models.ChicagoCheesePizza;
import org.example.factory.abstractfactory.models.ChicagoVeggiePizza;
import org.example.factory.abstractfactory.models.NYChessePizza;
import org.example.factory.abstractfactory.models.NYVeggiePizza;
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
