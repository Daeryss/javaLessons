package pattern.creational.Creat02_factoryMethod.buttomsExample.factory;

import pattern.creational.Creat02_factoryMethod.buttomsExample.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
    }

    public abstract Button createButton();
}
