package org.example.factory.abstractfactory.storefactory;

import org.example.factory.simplefactory.model.Pizza;

/*
* Defines interface for creating obj, subclasses decided what to instantiate
* factory method lets class defer instantiation to subclasses
* decide - which subclass will create the pizza during runtime
* the creator class - pizza store does no know who is creating the pizza
* */
public abstract class PizzaStore {

    public Pizza orderPIzza(String name){
        return createPizza(name);
    }

    //factory method
    /*
    * abstract - so that subclass deals with obj creation
    * Pizza - the instance created
    * createPizza - isolates orderPIzza from knowing which instance is getting called
    * */
    public abstract Pizza createPizza(String name);
}
