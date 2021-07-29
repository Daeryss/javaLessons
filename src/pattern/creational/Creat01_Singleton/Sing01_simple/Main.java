package pattern.creational.Creat01_Singleton.Sing01_simple;

public class Main {
    public static void main(String[] args) {
        var singleton1 = Single.getInstance();
        var singleton2 = Single.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton2);
    }
}
