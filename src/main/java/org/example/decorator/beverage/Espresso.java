package org.example.decorator.beverage;

public class Espresso extends Beverage {

    @Override
    public int cost() {
        description();
        return 100;
    }

    @Override
    public void description() {
        System.out.println("Espresso");
    }
}
