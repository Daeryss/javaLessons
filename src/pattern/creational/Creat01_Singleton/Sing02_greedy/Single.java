package pattern.creational.Creat01_Singleton.Sing02_greedy;

/*
 * Single.
 *
 * + Простая и прозрачная реализация
 * + Потокобезопасность
 * - Не ленивая инициализация
 */

public class Single {
    private static final Single instance = new Single();

    private Single() {
    }

    public static Single getInstance() {
        return instance;
    }
}
