package pattern.behavioral.beh10_templatemethod.before;

public class SimpleGame {
    private int count;

    public void play () {
        count = 3;
        System.out.println("started simple game");
        while (count > 0) {
            count--;
            System.out.println("step of simple game");
        }
        System.out.println("game was ended");
    }
}
