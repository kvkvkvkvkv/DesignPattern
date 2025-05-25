package org.example.factory.gpt.factory;


import org.example.factory.gpt.model.button.Button;
import org.example.factory.gpt.model.checkbox.Checkbox;

public interface UIFactory {
    Button createButton();
    Checkbox createCheckBox();
}
