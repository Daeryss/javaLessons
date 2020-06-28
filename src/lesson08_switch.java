import java.util.ArrayList;
import java.util.Scanner;

public class lesson08_switch {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        switch (n) {
            case 0:
                System.out.println("your are too young");
                break;
            case 7:
                System.out.println("welcome to school");
                break;
            case 18:
                System.out.println("welcom to university");
                break;
            default:
                System.out.println("another age");
        }
        String zero = s.nextLine(); // чтобы считать остатки строки после числа
        String str = s.nextLine();
        switch (str) {
            case "hello":
                System.out.println("hello user");
                break;
            default:
                System.out.println("i dont understand you");
                break;
        }

    }
}
