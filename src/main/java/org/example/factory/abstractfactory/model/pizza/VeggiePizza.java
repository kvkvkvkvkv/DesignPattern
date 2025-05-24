package org.example.factory.abstractfactory.model.pizza;

import org.example.factory.abstractfactory.IngredientFactory;

public class VeggiePizza extends Pizza{

    public VeggiePizza(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    @Override
    public void prepare() {
        ingredientFactory.createCheese();
        ingredientFactory.createClam();
        ingredientFactory.createDough();
        ingredientFactory.createSauce();
        System.out.println("Prepare Veggie Pizza");
    }
}
