interface AbleToEat {
    public void eating();
}

class Animal26 {
    public void eat () {
        System.out.println("im eating");
    }
}

class OtherAnimal extends Animal26 { // класс создан для переопределения метода eat
    @Override
    public void eat() {
        System.out.println("Other animal eats");
    }
}

public class lesson26_anonimClass {
    public static void main(String[] args) {
        Animal26 animal = new Animal26();
        animal.eat(); // "im eating"

        Animal26 animal2 = new OtherAnimal();
        animal2.eat(); // "Other animal eats" - переопределили

        Animal26 animal3 = new Animal26() { // переопределили метод, создав
                                    // новый анонимный (без названия) класс, наследуемый от Animal26
            @Override
            public void eat() {
                System.out.println("i like eating");
            }
        };
        animal3.eat(); // "i like eating"

        // это полезно для реализации интерфейсов:
        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eating() {
                System.out.println("i can eat");
            }
        };
        ableToEat.eating(); // "i can eat"
    }
}
