package pattern.behavioral.beh10_templatemethod.before;

import java.util.Random;

public class RandomGame {
    private Random random = new Random();
    private int count;
    private int totalResult;

    public void play() {
        count = random.nextInt(5);
        totalResult = count;
        System.out.println("started ranfom game");

        while (count > 0) {
            count--;
            System.out.println("step of random game");
        }

        System.out.printf("game ended with total result: %d\n", totalResult);
    }
}
