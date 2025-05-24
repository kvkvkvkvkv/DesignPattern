package org.example.factory.abstractfactory.model.pizza;

import org.example.factory.abstractfactory.IngredientFactory;

public class CheesePizza extends Pizza{

    public CheesePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {
        ingredientFactory.createCheese();
        ingredientFactory.createClam();
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        System.out.println("CheesePizza prepared");
    }
}
