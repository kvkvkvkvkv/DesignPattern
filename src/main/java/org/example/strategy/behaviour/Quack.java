package org.example.strategy.behaviour;

public class Quack implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Quacking");
    }
}
