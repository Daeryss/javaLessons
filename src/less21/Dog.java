package less21;

public class Dog extends Animal{
    public void bark() {
        System.out.println("im barking");
    }

    @Override
    public void est() {
        System.out.println("dog is eating");
    }
}
