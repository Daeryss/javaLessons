package pattern.creational.fabricMethod.buttomsExample.factory;

import pattern.creational.fabricMethod.buttomsExample.buttons.Button;
import pattern.creational.fabricMethod.buttomsExample.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
