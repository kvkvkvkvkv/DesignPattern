package org.example;

import org.example.strategy.behaviour.FlyWithFuel;
import org.example.strategy.behaviour.FlyWithWings;
import org.example.strategy.behaviour.Quack;
import org.example.strategy.behaviour.Squeak;
import org.example.strategy.models.Duck;
import org.example.strategy.models.RedHeadDuck;
import org.example.strategy.models.RubberDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Duck redHead = new RedHeadDuck();
        redHead.displayDuck();
        redHead.setFlyBehaviour(new FlyWithWings());
        redHead.setQuackBehaviour(new Quack());
        redHead.performFly();
        redHead.performQuack();

        Duck rubber = new RubberDuck();
        rubber.displayDuck();
        rubber.setFlyBehaviour(new FlyWithFuel());
        rubber.setQuackBehaviour(new Squeak());
        rubber.performFly();
        rubber.performQuack();
    }
}