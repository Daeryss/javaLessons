public class lesson13_constructor {
    public static void main(String[] args) {
        Person13 pers = new Person13("John", 31);
        pers.speak();
    }
}

class Person13{
    private String name;
    private int age;

    public Person13(String name, int age) { // конструктор имеет то же имя, что
        // и имя класса, их может быть несколько,
        // до тех пор, пока они не совпадают
        //по умолчанию стоит пустой конструктор
        this.name = name;
        this.age = age;
    }
    void speak() {
        System.out.println(name + " " + age);
    }
}
