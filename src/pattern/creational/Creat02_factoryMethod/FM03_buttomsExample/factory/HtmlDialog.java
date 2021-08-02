package pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.factory;

import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.buttons.Button;
import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
