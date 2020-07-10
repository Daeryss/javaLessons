import javax.swing.text.Document;
import javax.swing.text.html.HTML;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        MagicNumber[] numbers = new MagicNumber[8];

        for (int i = 0; i < numbers.length; i++) {
            MagicNumber magicNumber = new MagicNumber(i);
            magicNumber.show();
        }
    }
}

class MagicNumber {

    private final static int[] NUMBERS;
    private static int next = 0;

    private int number;

    static {
        NUMBERS = new int[] { 1, 3, 7, 15, 31, 63 };
    }

    {
        this.number = NUMBERS[next % NUMBERS.length];
        next++;
    }

    public MagicNumber(int base) {
        this.number += base;
    }

    public void show (){
        System.out.print(number + " ");
    }
}
