package org.example.factory.gpt.model.button;

public class AndroidButton implements Button{
    @Override
    public void click() {
        System.out.println("Android button clicked");
    }
}
