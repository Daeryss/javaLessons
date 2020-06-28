import java.util.Scanner;

public class lesson05_Input {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt(); // считывает число с консоли до первого пробела
        String str = s.next(); // считывает вводдо первого пробела
        String newStr = s.nextLine(); // считывает воод до конца строки
        boolean x = s.hasNextBoolean(); // все типы данных по аналогии
        boolean hasNext = s.hasNext(); // принимает значение true/false если в консоли есть еще что-то
        boolean hasNextInt = s.hasNextInt(); // принимает значение true/false если в консоли есть int
    }
}
