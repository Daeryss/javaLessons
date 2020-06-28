/*
* выдававаемые ошибки - объекты класса Exception, это позволяет
* работать с ними, как с объектами, в частности "ловить"
* */

import java.io.IOException;
import java.util.Scanner;

public class lesson28_exception {
    public static void main(String[] args) throws ScannerException { // подтвердили возможность появления исключения
        Scanner s = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(s.nextLine());

            if (x != 0) {
                throw new ScannerException("польлзователь ввел что-то кроме 0");
            }
        }
    }
}

class ScannerException extends Exception { // иницировали новое исключение, которое расширяет класс исключений
    public ScannerException (String description) {
        super(description);
    }
}
