package pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.factory;

import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.buttons.Button;
import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
