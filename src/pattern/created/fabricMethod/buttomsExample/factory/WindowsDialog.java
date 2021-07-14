package pattern.created.fabricMethod.buttomsExample.factory;

import pattern.created.fabricMethod.buttomsExample.buttons.Button;
import pattern.created.fabricMethod.buttomsExample.buttons.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
