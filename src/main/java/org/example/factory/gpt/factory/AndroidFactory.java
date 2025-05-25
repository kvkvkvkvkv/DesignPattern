package org.example.factory.gpt.factory;


import org.example.factory.gpt.model.button.AndroidButton;
import org.example.factory.gpt.model.button.Button;
import org.example.factory.gpt.model.checkbox.AndroidCheckbox;
import org.example.factory.gpt.model.checkbox.Checkbox;

public class AndroidFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new AndroidButton();
    }

    @Override
    public Checkbox createCheckBox() {
        return new AndroidCheckbox();
    }
}
