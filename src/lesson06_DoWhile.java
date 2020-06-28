import java.util.Scanner;

public class lesson06_DoWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int value;
        do {
            System.out.println("input five:");
            value = s.nextInt();
        } while (value != 5);
        System.out.println("your input is 5!");
    }
}
