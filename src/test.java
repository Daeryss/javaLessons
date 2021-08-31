import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.StringJoiner;

public class test {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        int x = s.nextInt();
        int count = 0;
        while (x != 0) {
            count += x;
            x = s.nextInt();
        }
        System.out.println(count);
    }
}