package functionalProgramming;

import java.util.function.*;

public class f4_fInterfaces {
    public static void main(String[] args) {
        Predicate<Integer> predicate = x -> x > 5;
        System.out.println(predicate.test(10)); // true

        Consumer<Integer> consumer = x -> System.out.println(x);
        consumer.accept(6);

        Function<Integer, String> function = x -> x.toString();
        System.out.println(function.apply(14));

        Supplier<Integer> supplier = () -> new Integer(5);
        System.out.println(supplier.get()); // return 5

        UnaryOperator<Integer> unaryOperator = x -> x * x;
        System.out.println(unaryOperator.apply(3)); // 9

    }
}
