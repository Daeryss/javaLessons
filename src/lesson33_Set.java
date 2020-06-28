/*
* Set - представляет собой набор уникальных элементов (не повторяющихся)
* в Set невозможно получить элемент по индексу
**/

import java.util.*;

public class lesson33_Set {
    public static void main(String[] args) {
        // Set.of - самый простой способ создать << неизменяемый (immutable)>> набор
        Set<String> emptySet = Set.of();
        Set<String> person = Set.of("Charls", "Larry", "Bob");
        Set<Integer> numbers = Set.of(10, 20, 30, 100);
        System.out.println(numbers);

        // HashSet - представляет собой набор хэш-таблиц, использует хэшкоды для
        // эффективного хранения. Не дат никаких гарантий относительно порядка
        // на практике очень эффективен contain именно в HashSet

        Set<String> countries = new HashSet<>();
        countries.add("Russia");
        countries.add("Germany");
        countries.add("Japan");
        System.out.println(countries);

        Set<String> usa = new HashSet<>();
        usa.add("USA");
        usa.add("Japan");

        countries.contains("USA"); // false
        countries.addAll(usa); // добавит все новое из USA
        countries.retainAll(usa); // сохранит только то, что в USA
        countries.add("Russia");
        countries.add("Germany");
        countries.removeAll(usa); // удалит все совпадающие с usa
        System.out.println(countries);

        // TreeSet - дает гарантию упорядоченности
        // расширяет SortedSet

        SortedSet<Integer> sortedSet = new TreeSet<>();
        sortedSet.add(10);
        sortedSet.add(15);
        sortedSet.add(13);
        sortedSet.add(21);
        sortedSet.add(17);
        System.out.println(sortedSet); //  [10, 13, 15, 17, 21]
        sortedSet.headSet(15); // [10, 13] (<15)
        sortedSet.tailSet(17); // [17, 21] (>=17)
        sortedSet.subSet(13, 17); // [13, 15] (13 <= ... < 17)
        sortedSet.first(); // 10
        sortedSet.last(); // 21

        // LinkedHashSet - гарантирует упорядоченность, соответствующую вводу
        // почти также быстро, как HashSet

        Set<Character> characters = new LinkedHashSet<>();
        for (char c = 'a'; c <= 'k'; c++) {
            characters.add(c);
        }
        System.out.println(characters); // [a, b, c, d, e, f, g, h, i, j, k]


        // сравнение - сравнивается содержимое
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 3));    // false
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 2, 3)); // true
        Objects.equals(Set.of(1, 2, 3), Set.of(1, 3, 2)); // true
    }
}
