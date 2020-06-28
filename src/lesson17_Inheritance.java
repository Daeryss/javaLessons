/*
* для этого урока см также lesson17_Dog & lesson17Animal
*/

public class lesson17_Inheritance {
    public static void main(String[] args) {
        lesson17Animal animal = new lesson17Animal();
        animal.eat();
        animal.sleep();
        lesson17_Dog dog = new lesson17_Dog();
        dog.sleep();// таким образом показали наследование от класса
        dog.eat(); // переопределенный родительский метод
        dog.bark(); // уникальны метод для класса Dog
        dog.name = "Boy";
        dog.sayName();

    }
}

/*
public class lesson17_Dog extends lesson17Animal {

    public void bark() {
        System.out.println("Im barkink"); // уникальным метод класса Dog
    }

    @Override
    public void eat() { // переопределение метода
        System.out.println("Dog eating");
    }
    public void sayName () { // наследование поля
        System.out.println(name);
    }
}*
*
public class lesson17Animal {

    String name;

    public void eat() {
        System.out.println("Im eating");
    }

    public void sleep() {
        System.out.println("Im sleeping");
    }
}
*/