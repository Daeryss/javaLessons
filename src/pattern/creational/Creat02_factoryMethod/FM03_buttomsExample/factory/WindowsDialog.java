package pattern.creational.Creat02_factoryMethod.buttomsExample.factory;

import pattern.creational.Creat02_factoryMethod.buttomsExample.buttons.Button;
import pattern.creational.Creat02_factoryMethod.buttomsExample.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
