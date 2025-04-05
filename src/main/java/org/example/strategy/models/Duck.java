package org.example.strategy.models;


import org.example.strategy.behaviour.FlyBehaviour;
import org.example.strategy.behaviour.QuackBehaviour;

public class Duck {
    private String display;
    private FlyBehaviour flyBehaviour;
    private QuackBehaviour quackBehaviour;

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public FlyBehaviour getFlyBehaviour() {
        return flyBehaviour;
    }

    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    public QuackBehaviour getQuackBehaviour() {
        return quackBehaviour;
    }

    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        this.flyBehaviour.fly();
    }

    public void performQuack() {
        this.quackBehaviour.quack();
    }

    public void displayDuck() {
        System.out.println(this.getDisplay());
    }
}
