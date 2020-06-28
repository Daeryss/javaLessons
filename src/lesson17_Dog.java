/*
класс lesson17_Dog расширяет базовый класс lesson17Animal командой extend
таким образом, Dog, наследует все методы и поля  базового класса, но при этом может
класс может наследовать только одн другой класс
*/
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
}
