import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        test t = new test();
        Scanner s = new Scanner(System.in);

        String[] input = s.nextLine().split(" ");
        int sum = 0;
        for (int i = 0; i < input.length; i++){
            sum += t.setValue(input[i]);
        }
        System.out.println(sum);


    }

    private int setValue(String str) {
        switch (str){
            case "severe":
                return 1000;
            case "warning":
                return 900;

            case "info":
                return 800;

            case "config":
                return 700;

            case "fine":
                return 500;

            case "finer":
                return 400;

            case "finest":
                return 300;

            default:
                break;
        }
        return 0;
    }
}
