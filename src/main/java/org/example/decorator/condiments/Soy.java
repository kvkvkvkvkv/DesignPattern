package org.example.decorator.condiments;

import org.example.decorator.beverage.Beverage;

public class Soy extends CondimentDecorator{
    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        description();
        return this.beverage.cost() + 10;
    }

    @Override
    public void description() {
        System.out.println("Adding Soy");
    }
}
