import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        double count = 10000;
        for(int i = 0; i < 12; i++) {
            count += count * 0.1 + 3000;
            System.out.printf("%d mounth %.2f\n", i, count);
        }

    }
}