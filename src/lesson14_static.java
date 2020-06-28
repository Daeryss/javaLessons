public class lesson14_static {
    public static void main(String[] args) {
        Person14 pers = new Person14("John", 31);
        Person14.description = "static field";
        System.out.println(pers.description);
        Person14 pers2 = new Person14("Dilan", 43);
        pers2.description = "modified static string";
        Person14.printStatic();
    }
}

class Person14 {
    private String name; // уникальные поля для каждого элемента класса
    private int age;
    public static String description; // публичная переменная доступна
                // всем объектам класса и общая для всех объектов класса
    public final int CONSTANT = 10; // константа, не изменяется, принято писать заглавными



    public Person14(String name, int age) {
        this.name = name;
        this.age = age;

    }
    public static void printStatic () { // статичный метод имеет доступ
                                        // только к статичным переменным
        System.out.println(description);
    }
}