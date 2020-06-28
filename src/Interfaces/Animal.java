package Interfaces;

public class Animal implements info {
    public int id;

    public Animal(int id){
        this.id = id;
    }

    public void sleep() {
        System.out.println("im sleeping");
    }

    public void eat() {
        System.out.println("im eating");
    }

    @Override
    public void showInfo() {
        System.out.println("Id is " + this.id);
    }
}
