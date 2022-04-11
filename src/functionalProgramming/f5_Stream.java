package functionalProgramming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toCollection;

public class f5_Stream {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        list1.add("one");
        list1.add("two");
        list1.add("three");

        list2.add("four");
        list2.add("five");
        list2.add("six");

        Stream<String> stream = list1.stream();
        stream.forEach(x -> System.out.print(x + " "));
        System.out.println();
        /** после выполнения операции стрим закроется и повторно его использовать нельзя, для этого необходимо повторно его переназначить*/
        stream = list1.stream();
        //filter - фильтрует по условию, можно наложить несколько последовательных фильтров
        //collect - засовывает элементы в выбранную коллекцию, дальше с ней можно работать, как с листом/сетом и тд
        List<String> tempList =  stream.filter(x -> x.length() < 4).collect(Collectors.toList());
        System.out.println(tempList);
        //map - для всех элементов
        System.out.println(list1.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.toSet()));
        // flatMap - объединяет в оидн
        System.out.println(Stream.of(list1, list2).flatMap(x -> x.stream()).collect(Collectors.toList()));


        int val1 = Stream.of(1, 1, 2, 4, 5,-2).min(Comparator.comparing(x -> x)).get();
        int val2 = Stream.of(1, 2, 4, 5,-2).max(Comparator.comparing(x -> x)).get();
        System.out.println("min: " + val1 + ", max: " + val2);

        int sum = Stream.of(1, 2, 3).reduce(0, (acc, elemen) -> acc + elemen); // 6

        Stream.of(1, 1, 2, 4, 5,-2).sorted(); // сортирует, также принимает компаратор
        Stream.of(1, 1, 2, 4, 5,-2).limit(3); // первые 3
        Stream.of(1, 1, 2, 4, 5,-2).distinct(); // только уникальные
        Stream.of(1, 1, 2, 4, 5,-2).skip(2); // пропустить первые 2
        Stream.of("one", "one").filter(x -> x.equals("one")).findAny().get();
        Stream.of("one", "one").filter(x -> x.equals("one")).findFirst().get();

        IntStream intStream = Stream.of(1, 1, 2, 4, 5,-2).mapToInt(x -> x); // переводит Integer в int, тк int легковесный
        // имеет свои методы
        intStream.average();

        //следующие две записи абсолютно аналогичны
        Stream.of("one", "two", "three").map(x -> x.toUpperCase()).forEach(x -> System.out.print(x + " "));
        Stream.of("one", "two", "three").map(String::toUpperCase).forEach(System.out::println);


        /**collector - для четкого определения куда именно собирать, следует вписать это в конструктор
         * */
        List<Integer> tempArrList = Stream.of(1, 1, 2, 4, 5, -2).collect(toCollection(ArrayList::new));
        System.out.println(tempArrList);
        Set<Integer> tempSet = Stream.of(1, 1, 2, 4, 5, -2).collect(toCollection(TreeSet::new));
        System.out.println(tempSet);

        Stream.of("one", "two", "three").collect(joining(", ", "{", "}")); // {one, two, three}
    }
}
