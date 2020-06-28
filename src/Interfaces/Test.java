package Interfaces;
// implements infо означает, что каласс обязан реализовывать метод info
// через запятую (info, ..., ...) можно перечислить реализацию нескольких интерфейсов


public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal(1);
        Person person1 = new Person("john");
        animal.showInfo();
        person1.showInfo();
        info kl = new Animal(32);


        //мы можем сделать следующее, только потму что оба класса реализуют интерфейс info:
        info inf1 = new Animal(1);
        info inf2 = new Person("Dick");
        // но эти объекты не евляются элементами класса Animal и Person
        // мы имеем доступ лишь к тому, что описано в интерфейсе info
        inf2.showInfo();
        outputInfo(inf1);
        outputInfo(person1);
        kl.showInfo();
    }
    public static void outputInfo(info out) {
        out.showInfo();
    }
}
