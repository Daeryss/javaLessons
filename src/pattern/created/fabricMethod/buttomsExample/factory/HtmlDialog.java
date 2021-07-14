package pattern.created.fabricMethod.buttomsExample.factory;

import pattern.created.fabricMethod.buttomsExample.buttons.Button;
import pattern.created.fabricMethod.buttomsExample.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
