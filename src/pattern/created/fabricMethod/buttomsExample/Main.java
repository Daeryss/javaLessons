package pattern.created.fabricMethod.buttomsExample;

import pattern.created.fabricMethod.buttomsExample.factory.Dialog;
import pattern.created.fabricMethod.buttomsExample.factory.HtmlDialog;
import pattern.created.fabricMethod.buttomsExample.factory.WindowsDialog;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    static void configure(){
        System.out.println(System.getProperty("os.name"));
        if(System.getProperty("os.name").equals("Windows")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
