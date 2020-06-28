package less21;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog1 = new Dog();
        Animal animal2 = new Dog(); // наследование позволяет делать так
                            // по сути это экземпляр класса Animal методы класса Dog недоступны для него
        Cat cat = new Cat();

        dog1.est();
        animal.est();
        animal2.est(); // переопределение позволяет нам выполнить то, что определно в класе-потомке
        trying(animal);
        trying(dog1);
        trying(cat);
        int[] num = {1,2,3};
        System.out.println(Arrays.binarySearch(num, 2));
    }

    public static void trying (Animal animal){
        animal.est();
    }
}
