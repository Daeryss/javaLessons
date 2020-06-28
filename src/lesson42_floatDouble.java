import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class lesson42_floatDouble {
    public static void main(String[] args) {
        double double1 = 3.34; // по умолчанию double
        float float1 = 3.14f; // необходимо явное приведение

        // округление
        System.out.println(Math.round(double1)); // математическое округление вернет int
        System.out.println(Math.ceil(double1)); // округление в большую сторону
        System.out.println(Math.floor(double1)); // округление в меньшую сторону

        double eps = 5e-3; // means 5 * 10^(-3) = 0.005
        double n = 0.01e2; // means 0.01 * 10^2 = 1.0

        // для double "/"  выполняет деление нацело
        System.out.println(double1 / 2); //1.57
        int x = 3;
        int y = 2;
        System.out.println(x * 1.0 / y); // 1.5

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); // для чтения 3,14 и 3.14

        double a = 8;
        double b = 5;
        double c = a / b + 1.1;
        System.out.println(c);


    }
}
