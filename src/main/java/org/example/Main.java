package org.example;

import org.example.decorator.beverage.Beverage;
import org.example.decorator.beverage.Tea;
import org.example.decorator.condiments.Matcha;
import org.example.decorator.condiments.Whip;
import org.example.factory.abstractfactory.NYIngredientFactory;
import org.example.factory.factory.storefactory.NYPizzaStoreFactory;
import org.example.factory.simplefactory.PizzaFactory;
import org.example.factory.simplefactory.PizzaStore;
import org.example.factory.gpt.factory.AndroidFactory;
import org.example.factory.gpt.factory.UIClient;
import org.example.observer.observer.MobileDisplay;
import org.example.observer.observer.WebDisplay;
import org.example.observer.subject.WeatherData;
import org.example.singleton.ConfigManagerEagerLoading;
import org.example.singleton.ConfigManagerLazyLoading;
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

        strategy();
        observer();
        decorator();
        System.out.println("Whole point of factory is to use subclasses for obj creation " +
                "\n clients are decoupled from concrete classes");
        simpleFactory();
        factory();
        abstractFactory();
        gpt();
        singleton();

    }

    private static void singleton() {
        System.out.println("**********Singleton **********");
        ConfigManagerEagerLoading configManagerEagerLoading = ConfigManagerEagerLoading.getInstance();
        configManagerEagerLoading.loadConfig();

        ConfigManagerLazyLoading configManagerLazyLoading = ConfigManagerLazyLoading.getInstance();
        configManagerLazyLoading.loadConfig();
    }

    private static void gpt() {
        System.out.println("**********Abstract Factory Pattern GPT **********");
        UIClient uiClient = new UIClient(new AndroidFactory());
        uiClient.createUI();
    }

    private static void abstractFactory() {
        System.out.println("**********Abstract Factory Pattern**********");
        System.out.println("Uses composition where as factory will use inheritance");
        org.example.factory.abstractfactory.storefactory.PizzaStore pizzaStore = new
                org.example.factory.abstractfactory.storefactory.NYPizzaStoreFactory(new NYIngredientFactory());
        pizzaStore.orderPIzza("cheese");
    }

    private static void factory() {
        System.out.println("**********Factory Pattern**********");
        System.out.println("Used for single product, creator needs single product");
        org.example.factory.factory.storefactory.PizzaStore pizzaStore = new NYPizzaStoreFactory();
        pizzaStore.orderPIzza("cheese");
    }

    private static void simpleFactory() {
        System.out.println("**********Simple Factory Pattern**********");
        PizzaStore pizzaStore = new PizzaStore(new PizzaFactory());
        pizzaStore.orderPizza("cheese");
    }

    private static void decorator() {
        System.out.println("**********Decorator Pattern**********");
        Beverage beverage = new Tea();
        beverage = new Matcha(beverage);
        beverage = new Whip(beverage);
        System.out.println(beverage.cost());
    }

    private static void observer() {
        System.out.println("**********Observer Pattern**********");
        WeatherData weatherData = new WeatherData();
        MobileDisplay mobileDisplay = new MobileDisplay(weatherData);
        WebDisplay webDisplay = new WebDisplay(weatherData);
        weatherData.registerObserver(mobileDisplay);
        weatherData.registerObserver(webDisplay);
        weatherData.setData(10,20,30);
        weatherData.removeObserver(mobileDisplay);
        weatherData.setData(40,50,60);
    }

    private static void strategy() {
        System.out.println("**********Strategy Pattern**********");
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