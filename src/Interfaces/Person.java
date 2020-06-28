package Interfaces;
// implements infо означает, что каласс обязан реализовывать метод info
// через запятую (info, ..., ...) можно перечислить реализацию нескольких интерфейсов

public class Person implements info{
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println("hello");
    }

    public void showInfo(){
        System.out.println("Name is " + this.name);
    }
}
