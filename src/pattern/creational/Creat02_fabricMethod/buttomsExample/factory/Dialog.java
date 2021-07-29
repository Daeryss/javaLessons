package pattern.creational.fabricMethod.buttomsExample.factory;

import pattern.creational.fabricMethod.buttomsExample.buttons.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
    }

    public abstract Button createButton();
}
