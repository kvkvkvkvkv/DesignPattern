package org.example.factory.simplefactory;

import org.example.factory.simplefactory.model.Pizza;

public class PizzaFactory {

    public Pizza createPizza(String name){
        if (name.equals("veggie")) {
            return new VeggiePizza("veggie");
        } else if (name.equals("cheese")){
            return new CheesePizza("cheese");
        } else {
            return new PepperoniPizza("pepperoni");
        }
    }
}
