package org.example.decorator.beverage;

public class Latte extends Beverage {

    @Override
    public int cost() {
        description();
        return 111;
    }

    @Override
    public void description() {
        System.out.println("Latte");
    }
}
