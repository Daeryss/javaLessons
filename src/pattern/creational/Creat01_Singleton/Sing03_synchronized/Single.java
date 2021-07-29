package pattern.creational.Creat01_Singleton.Sing03_synchronized;
/*
 * Single.
 * Жадный так synchronized мы тратим много ресурсов на обращение getInstance. Дорагая реалиазация
 * + Ленивая инициализация
 * - Низкая производительность
 */

public class Single {
    private static Single instance;

    private Single() {
    }

    public static synchronized Single getInstance() {
        if (instance == null) {
            instance = new Single();
        }
        return instance;
    }
}
