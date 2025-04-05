package org.example.strategy.behaviour;

public class Squeak implements QuackBehaviour{

    @Override
    public void quack() {
        System.out.println("Squeaking");
    }
}
