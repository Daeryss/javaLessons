package pattern.behavioral.beh10_templatemethod.after;

public abstract class GameBase {
    public void  play() {
        initGame();
        while (!isGameOver()) {
            nextTurn();
        }
        System.out.println("Игра окончена со счетом: " + getTotalResult());
    }

    protected abstract void initGame();

    protected abstract boolean isGameOver();

    protected abstract void nextTurn();

    protected abstract int getTotalResult();
}
