package org.example.factory.abstractfactory;

import org.example.factory.abstractfactory.model.cheese.Cheese;
import org.example.factory.abstractfactory.model.cheese.Goat;
import org.example.factory.abstractfactory.model.cheese.Mozzarella;
import org.example.factory.abstractfactory.model.clam.Clam;
import org.example.factory.abstractfactory.model.clam.FreshClam;
import org.example.factory.abstractfactory.model.clam.FrozenClam;
import org.example.factory.abstractfactory.model.dough.Dough;
import org.example.factory.abstractfactory.model.dough.ThickCrust;
import org.example.factory.abstractfactory.model.dough.ThinCrust;
import org.example.factory.abstractfactory.model.sauce.MarinaraSauce;
import org.example.factory.abstractfactory.model.sauce.Sauce;
import org.example.factory.abstractfactory.model.sauce.TomatoSauce;

public class ChicagoIngredientFactory implements IngredientFactory{
    @Override
    public Cheese createCheese() {
        return new Goat();
    }

    @Override
    public Clam createClam() {
        return new FrozenClam();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinCrust();
    }
}
