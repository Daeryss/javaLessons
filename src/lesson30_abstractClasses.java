/* ключевое слово abstract показывает, что от этого класса можно тольок наследовать,
 но нельзя создавать объекты этого класса, делая этот класс концепцией, а не сущностью
 необходимо для создания иерархии класов, но класс-родитель не является самостоятельным
 абстрактный класс очень похож на интерфес, но есть разница.
 интерфейс - то, что класс умеет делать, а абстрактный клас - то,
 чем является. В классе-родителе есть методы, которые наследуются и могут выплнятся (eat),
 в интерфейсе только прописаны методы, которые необходимо реализовать
 */



public class lesson30_abstractClasses {
    public static void main(String[] args) {
        Cat30 cat = new Cat30();
        Dog30 dog = new Dog30();
        dog.voice();
        dog.eat();


    }

    static abstract class Animal30 {
        public void eat () {
            System.out.println("im eating");
        }

        public abstract void voice(); // обязательный к реализации метод в классах-наследниках
    }

    static class Dog30 extends Animal30 {
        @Override
        public void voice () {
            System.out.println("im barking");
        }
    }

    static class Cat30 extends Animal30 {
        @Override
        public void voice () {
            System.out.println("meow");
        }
    }
}
