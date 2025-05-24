package org.example.decorator.beverage;

public abstract class Beverage {
    Size size = Size.TALL;
    public abstract int cost();
    public abstract void description();

    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }
}
