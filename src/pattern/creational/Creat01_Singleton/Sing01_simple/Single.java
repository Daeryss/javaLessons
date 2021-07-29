package pattern.creational.Creat01_Singleton.Sing01_simple;

public class Single {

    private static Single instance;

    public Single() {
    }

    public static Single getInstance() {
        if(instance == null) {
            instance = new Single();
        }
        return instance;
    }
}
