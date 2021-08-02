package pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.factory;

import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
    }

    public abstract Button createButton();
}
