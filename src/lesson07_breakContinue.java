public class lesson07_breakContinue {
    public static void main(String[] args) {
        int j = 0;
        while (true) {
            if (j == 5) {
                break; // останавливает цикл
            }
            System.out.println("j = " + j);
            j++;
        }

        for (int i = 0; i < 5; i++) {
            if (i % 2==0) {
                continue;                   // прерывает и запускает цикл заново
            }
            System.out.println("it is odd num " + i);
        }
    }
}
