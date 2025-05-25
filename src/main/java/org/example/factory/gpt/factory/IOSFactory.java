package org.example.factory.gpt.factory;


import org.example.factory.gpt.model.button.Button;
import org.example.factory.gpt.model.button.IOSButton;
import org.example.factory.gpt.model.checkbox.Checkbox;
import org.example.factory.gpt.model.checkbox.IOSCheckbox;

public class IOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new IOSButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new IOSCheckbox();
    }
}
