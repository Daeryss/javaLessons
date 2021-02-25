import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int sum = 0;
        for(int i = 0; i < 366;i++) {
            sum += i;
        }
        System.out.println(sum);
        try {
            Thread.sleep(500);
        } catch (Exception e) {
            System.out.println("something goes wrong");
        }
        System.out.println(start - System.currentTimeMillis());
    }


}
