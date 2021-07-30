package pattern.creational.Creat02_factoryMethod.buttomsExample.factory;

import pattern.creational.Creat02_factoryMethod.buttomsExample.buttons.Button;
import pattern.creational.Creat02_factoryMethod.buttomsExample.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
