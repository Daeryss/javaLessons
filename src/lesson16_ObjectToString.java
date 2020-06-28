public class lesson16_ObjectToString {
    public static void main(String[] args) {
        Human16 h1 = new Human16("John", 31);
        System.out.println(h1); // по умолчанию используется метод toString()
                // переопределив toString() будет выводится заданное значение
        System.out.println(h1.toString());
    }
}
class Human16 {
    private String name;
    private int age;

    public Human16(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString () { // переопределили дефолтный метод
        return name + ", " + age;
    }
}