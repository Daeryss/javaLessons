import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int k = scanner.nextInt();
        int n = scanner.nextInt();
        double m = Double.parseDouble(scanner.nextLine());*/
        //String str = scanner.nextLine();
        int[] nums = {1, 3, 4, 5};

        for (int i = 0; i <= 3; i++) { System.out.print(nums[0]); }
        System.out.println();

        for (int i = 1; i <= 3; i++) { System.out.print(nums[i]); }
        System.out.println();

        for (int i = 0; i <= 3; i++) { System.out.print(nums[i]); }
        System.out.println();

        for (int i = 0; i < nums.length; i++) { System.out.print(nums[i]); }
        System.out.println();

        for (int i = nums.length - 1; i >= 0; i--) { System.out.println(nums[i]); }


    }
}
