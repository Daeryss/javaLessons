package functionalProgramming.f2_functionalInterface;

import java.util.Scanner;
import java.util.function.*;

/*
в случае если мы не знаем, какой тип данных будем возвращить,
в функциональном интерфейсе можно использовать обобщенный тип данных <T>
 */
public class Main {
    public static void main(String[] args) {
        // в первом примере обобщенный тип <T> типизировали как <Integer>
        Operation<Integer> addition = (value1, value2) -> value1 + value2;

        // во втором примере обобщенный тип <T> типизировали как <String>
        Operation<String> concat = ((value1, value2) -> value1 + value2);

        System.out.println(addition.getResult(15, 7));
        System.out.println(concat.getResult("Hello ", "lambda"));

        //также в Java8 есть предустановленные функциональные интерфейсы
        //то есть такие, для которых нет необходимости писать предварительно отдельный интерфейс

        System.out.println("\nPredicate.test возвращает boolean.\n\tboolean test(T t);");
        Predicate<Integer> isZero = val1 -> val1 == 0;
        System.out.println(isZero.test(4));
        System.out.println(isZero.test(0));

        System.out.println("\nConsumer.accept (потребитель) выполняет какие-либо операции \nнад передаваемым объектом, но ничего не возвращают\n" +
                "\tvoid accept(T t);");
        Consumer<String> consumer = str -> System.out.println(str);
        consumer.accept("It' consumer realization");

        System.out.println("\nFunction<T, R>.apply переходит от Т к R" +
                "\n\tR apply(T t);");
        Function<Integer, Double> function = value -> Double.valueOf(value);
        System.out.println(function.apply(12));


        System.out.println("\nSupplier<T>" + "\n\tT get();");

        Supplier<String> supplier = () -> {
            Scanner s  = new Scanner(System.in);
            System.out.print("enter string for Supplier: ");
            return s.nextLine();
        };
        System.out.println(supplier.get());

        System.out.println("\nUnaryOperator<Double>" + "\n\tT apply (T t);");
        UnaryOperator<Double> unop = val -> Math.sqrt(val);
        System.out.println(unop.apply(125.0));

        System.out.println("\nBinaryOperator" + "\n\tT apply (T t, T t);");
        BinaryOperator<Integer> binop = (val1, val2) -> val1 * val2;
        System.out.println(binop.apply(4, 12));

    }
}
