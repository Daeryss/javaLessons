import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        String[] str = "5+5+4+5+3+4+4+4+5+4+5+4+3+4+5+4+4+4+5+5+5+5+5+5+5+5+5+5".split("\\+");
        int sum = 0;
        for(String num : str) {
            sum += Integer.parseInt(num);
        }
        System.out.println(sum * 1.0 / str.length);
        WhichOfThree larger = (x, y, z) -> (x > y ? (x > z ? x : y) : (y > z ? y : z));
        System.out.println(larger.Larger(14, 12, 3));
        System.out.println();
        sileList("D:\\DP_lessons\\lesson2");
    }

    private interface WhichOfThree {
        int Larger(int x,int y, int z);
    }

    private static void sileList(String path) {
        File file = new File(path);
        String[] fileList = file.list();
        for (String name : fileList) {
            System.out.println(name);
        }
    }
}