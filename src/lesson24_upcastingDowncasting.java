public class lesson24_upcastingDowncasting {
    public static void main(String[] args) {
        // Upcasting - восходящее преобразование явное от потомка к родителю
        Dog dog1 = new Dog();
        Animal animal = new Dog(); // потому что Dog наследуется от Animal
                // наследует только методы родителя


        // downcasting - нисчходящее от родителя к потомку
        Dog dog2 = (Dog) animal; // потому что animal ссылается на Dog
                    // наследует методы дочки
        Animal a = new Animal();
        Dog dog = (Dog) a;
        dog.bark(); // не скомпелируется, потому что "а" не наследует класс Dog
    }
}

class Animal {
    public void eat (){
        System.out.println("im eating");
    }
}

class Dog extends Animal {
    public void bark () {
        System.out.println("im barking");
    }
}
