import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        System.out.println(fourLetters("hello this world"));
    }

    public static int fourLetters(String sentence) {
        // Напишите ваш код здесь...
        int count = 0;
        String[] str = sentence.split(" ");
        for (String s : str) {
            if (s.length() == 4) {
                count++;
            }
        }
        return count;
    }
}