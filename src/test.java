import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        int[] x = twoSum(new int[]{1,2,3}, 4);
        for (int n :x) {
            System.out.println(n);
        }
    }

    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        for(int i = 0; i < numbers.length; i++) {
            for (int j = 0; j <  numbers.length; j++) {
                if (i == j){
                    continue;
                }
                if(numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return null; // Do your magic!
    }
}