package org.example.decorator.condiments;

import org.example.decorator.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {
    Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    abstract public int cost();
    abstract public void description();
}
