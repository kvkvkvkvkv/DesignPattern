package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.model.cheese.Cheese;
import org.example.factory.abstractfactory.model.clam.Clam;
import org.example.factory.abstractfactory.model.dough.Dough;
import org.example.factory.abstractfactory.model.sauce.Sauce;

public interface IngredientFactory {
    Cheese createCheese();
    Clam createClam();
    Sauce createSauce();
    Dough createDough();
}
