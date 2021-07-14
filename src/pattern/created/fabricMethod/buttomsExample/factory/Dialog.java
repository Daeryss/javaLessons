package pattern.created.fabricMethod.buttomsExample.factory;

import pattern.created.fabricMethod.buttomsExample.buttons.Button;

import java.awt.*;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();
    }

    public abstract Button createButton();
}
