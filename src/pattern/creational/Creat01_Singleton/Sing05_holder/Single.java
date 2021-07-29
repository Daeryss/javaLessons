package pattern.creational.Creat01_Singleton.Sing05_holder;

/*
 * Single.
 * + Ленивая инициализация
 * + Высокая производительность
 * - Невозможно использовать для не статических полей класса
 */
public class Single {

    private Single() {
    }

    static class Holder {
        public static Single instance = new Single();
    }

    public static Single getInstance() {
        return Holder.instance;
    }
}
