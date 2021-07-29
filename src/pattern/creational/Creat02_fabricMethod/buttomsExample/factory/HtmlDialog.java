package pattern.creational.fabricMethod.buttomsExample.factory;

import pattern.creational.fabricMethod.buttomsExample.buttons.Button;
import pattern.creational.fabricMethod.buttomsExample.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
