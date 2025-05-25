package org.example.factory.gpt.model.checkbox;

public class IOSCheckbox implements Checkbox {
    @Override
    public void check() {
        System.out.println("IOS checkbox is checked");
    }
}
