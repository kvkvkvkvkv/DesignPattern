package org.example.strategy.behaviour;

public class FlyWithFuel implements FlyBehaviour{

    @Override
    public void fly() {
        System.out.println("Flying with Fuel");
    }
}
