package org.example.decorator.condiments;

import org.example.decorator.beverage.Beverage;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        description();
        return this.beverage.cost() + 30;
    }

    @Override
    public void description() {
        System.out.println("Adding Mocha");
    }
}
