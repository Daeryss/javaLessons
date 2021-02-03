package collection;
/*
операции над коллекциями в ява включают в себя ряд методов и интерфейсов
основной является Collection Framework в java.util

существует 2 корневых универсальных интерфейса Collection<E> и Map<K, V>
Collection<E> - абстрактная коллекция элементов одного вида
(основные интерфейсы коллекций  List<E>, Set<E>, Queue<E>, SortedSet<E>, и Deque<E>)
Map<K, V> - представляет собой карту или словарь для пар ключ-значение,
где К - тип ключей, V - тип хранимых значений.
 */

import java.util.ArrayList;
import java.util.Collection;

class lesson32_collectionFramework {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        // методы коллекций
        list.size(); // 3
        list.isEmpty(); // false
        list.contains(2); // true - возвращает true/false если находит элемент
        list.add(2, 1); // вставляет элемент н под индексом х (х, у)
                                // [1, 2, 1, 3]

        list.remove(2); //
                    // [1, 2, 3]
        list.clear(); // []
        System.out.println(list);

        Collection<String> languages = new ArrayList<>();
        languages.add("Spanish");
        languages.add("English");
        languages.add("Russian");
        languages.add("Spanish");
        languages.size(); // 4
        for (String string : languages) { // вывод всех элементов перебором
            System.out.print(string + " ");
        }
        System.out.println();
        languages.remove("Spanish"); // remove основан на методе equals и удаляет первое вхождение
        System.out.println(languages);
    }
}
