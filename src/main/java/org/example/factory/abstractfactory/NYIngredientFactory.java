package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.model.cheese.Cheese;
import org.example.factory.abstractfactory.model.cheese.Mozzarella;
import org.example.factory.abstractfactory.model.clam.Clam;
import org.example.factory.abstractfactory.model.clam.FreshClam;
import org.example.factory.abstractfactory.model.dough.Dough;
import org.example.factory.abstractfactory.model.dough.ThickCrust;
import org.example.factory.abstractfactory.model.sauce.Sauce;
import org.example.factory.abstractfactory.model.sauce.TomatoSauce;

import java.util.List;

public class NYIngredientFactory implements IngredientFactory{
    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Clam createClam() {
        return new FreshClam();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Dough createDough() {
        return new ThickCrust();
    }
}
