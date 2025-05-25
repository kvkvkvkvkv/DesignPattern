package org.example.factory.gpt.factory;

public class UIClient {

    UIFactory uiFactory;

    public UIClient(UIFactory uiFactory) {
        this.uiFactory = uiFactory;
    }

    public void createUI(){
        this.uiFactory.createButton().click();
        this.uiFactory.createCheckBox().check();
    }
}
