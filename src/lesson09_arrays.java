public class lesson09_arrays {
    public static void main(String[] args) {
        int[] num = new int[5]; // [0,0,0,0,0]
        for (int i = 0; i < 5; i++) {
            num[i] = i + 2;
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(num[i] + " ");
        }

        int[] num1 = {1, 2, 3, 67};
        System.out.println("\n" + num1[3]);

    }
}
