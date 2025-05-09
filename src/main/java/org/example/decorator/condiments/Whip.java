package org.example.decorator.condiments;

import org.example.decorator.beverage.Beverage;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int cost() {
        description();
        return this.beverage.cost() + 20;
    }

    @Override
    public void description() {
        System.out.println("Adding Whip");
    }
}
