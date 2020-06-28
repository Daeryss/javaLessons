import java.util.ArrayList;
import java.util.List;

public class lesson25_Generics {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>(); // как массив, но не обязательно сразу объявлять длину
        // но можем поместить только строки, тк объявили тип
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String a = animals.get(1);


        List<Animal25> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal25(1));
        listOfAnimal.add(new Animal25(2));
        speak(listOfAnimal);


        List<Dog25> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog25());
        listOfDogs.add(new Dog25());
        speak(listOfDogs);
    }

    private static void speak(List<? extends Animal25> list) { // <?> - означает, что мы можем передать любой объект,
                                        // <? extends Animal25> - означает, что мы можем передать либо
                                        // объект кдасса Animal25, те, что ниже
                                        // <? super Animal25> - означает, что мы можем передать либо
                                        // объект кдасса Animal25, те, что выше (Dog25 не можем, Object - можем)
        for (Animal25 animal25 : list){
            System.out.println(animal25);
            animal25.eat();
        }
    }
}

class Animal25 {
    private int id;

    public Animal25(){

    }

    public Animal25(int id){
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }

    public void eat () {
        System.out.println("im eating");
    }
}

class Dog25 extends Animal25 {
}
