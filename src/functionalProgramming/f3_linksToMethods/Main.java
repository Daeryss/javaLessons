package functionalProgramming.f3_linksToMethods;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Consumer<String> printer = System.out::println;
        printer.accept("Hello world!");

        //в данном примере показано использование ссылки на статический метод
        //тип данных в <> должен соотвтетствовать передаваемому в тело метода
        printer = Main::println;
        printer.accept("Hello from personal print method");


        //также можно использовать методы класса, если они определены через интерфейс
        //чтобы получить ссылку на конструктор, ставим имя класса и ::new;
        Database database = User::new;
        User user = database.create("Fyodor", "pass");
        System.out.printf("Name: %s\nPassword: %s\n", user.getName(), user.getPassword());

        //кроме того, что методы в java могут возвращать какое-то значение,
        //они могут возвращать и лямбда выражения
        System.out.println(getOperation('-').getResult(17, 2));

    }

    private static Operation getOperation(char c) {
        switch (c) {
            case '*':
                return ((val1, val2) -> val1 * val2);
            case '/':
                return ((val1, val2) -> val1 / val2);
            case '+':
                return ((val1, val2) -> val1 + val2);
            case '-':
                return ((val1, val2) -> val1 - val2);
            default:
                return ((val1, val2) -> 0);
        }
    }

    private static void println(String str) {
        System.out.println(str);
    }

}
