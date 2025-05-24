package org.example.factory.abstractfactory.storefactory;

import org.example.factory.abstractfactory.IngredientFactory;
import org.example.factory.abstractfactory.model.pizza.CheesePizza;
import org.example.factory.abstractfactory.model.pizza.Pizza;
import org.example.factory.abstractfactory.model.pizza.VeggiePizza;

public class NYPizzaStoreFactory extends PizzaStore {

    public NYPizzaStoreFactory(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
        System.out.println("NYPizzaStoreFactory");
    }

    @Override
    public Pizza createPizza(String name) {
        if (name.equals("cheese")) {
            return new CheesePizza(ingredientFactory);
        } else {
            return new VeggiePizza(ingredientFactory);
        }
    }
}
