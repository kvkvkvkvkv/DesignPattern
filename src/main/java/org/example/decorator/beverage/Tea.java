package org.example.decorator.beverage;

public class Tea extends Beverage {

    @Override
    public int cost() {
        description();
        return 222;
    }

    @Override
    public void description() {
        System.out.println("Tea");
    }
}
