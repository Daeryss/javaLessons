package pattern.creational.Creat02_factoryMethod.FM03_buttomsExample;

import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.factory.Dialog;
import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.factory.HtmlDialog;
import pattern.creational.Creat02_factoryMethod.FM03_buttomsExample.factory.WindowsDialog;

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
