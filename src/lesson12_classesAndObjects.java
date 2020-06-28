public class lesson12_classesAndObjects { // публичный класс может быть только один и его имя соответствует имени файла
    public static void main(String[] args) {
        Person12 pers1 = new Person12();
        pers1.setName("John");
        pers1.setAge(31);
        pers1.Speak12();
        System.out.println(pers1.getName() + " до пенсии осталось " + pers1.yearsToRetirement());

    }
}
class Person12 {
    // у класса могут быть: 1. поля (данные):
    private String name;
    private int age;
    // 2. методы:
    void Speak12 () { // этот метод ничего не возвращает
        System.out.println(name + " " + age);
    }
    int yearsToRetirement() { // возвращает int
        return 65 - age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}