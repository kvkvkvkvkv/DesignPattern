package org.example.factory.abstractfactory.model.pizza;

import org.example.factory.abstractfactory.IngredientFactory;

public abstract class Pizza {
    IngredientFactory ingredientFactory;

    Pizza(IngredientFactory ingredientFactory){
        this.ingredientFactory = ingredientFactory;
    }

    public abstract void prepare();
}
