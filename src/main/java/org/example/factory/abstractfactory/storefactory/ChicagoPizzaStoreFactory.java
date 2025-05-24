package org.example.factory.abstractfactory.storefactory;

import org.example.factory.abstractfactory.ChicagoIngredientFactory;
import org.example.factory.abstractfactory.IngredientFactory;
import org.example.factory.abstractfactory.NYIngredientFactory;
import org.example.factory.abstractfactory.model.pizza.CheesePizza;
import org.example.factory.abstractfactory.model.pizza.Pizza;
import org.example.factory.abstractfactory.model.pizza.VeggiePizza;


public class ChicagoPizzaStoreFactory extends PizzaStore {

    public ChicagoPizzaStoreFactory(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
        System.out.println("ChicagoPizzaStoreFactory");
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
