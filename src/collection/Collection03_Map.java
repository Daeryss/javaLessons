package collection;

// Map - пердставляет собой набор пар ключ-значение.
// Ключи всегда уникальны, а значения могут повторяться
// ключи аналогичны индексам массива, могут иметь любой тип
// также существуют изменияемы и неизменяемые карты

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.*;

class lesson34_Map {
    public static void main(String[] args) {
        // immutable map (неизменяемые)
        Map<String, String> emptyMap = Map.of();
        Map<String, String> phoneBook = Map.of(
                "Bob", "+1-202-555-0118",
                "James", "+1-202-555-0220",
                "Katy", "+1-202-555-0175"
        );
        // тк они не изменны, доступны методы которые не меняют карту
        emptyMap.size(); // 0
        phoneBook.size(); // 3 (три пары ключ-значение)
        phoneBook.get("Bob"); // +1-202-555-0118
        phoneBook.get("John"); // null
        phoneBook.getOrDefault("Alex", "3515"); // 3515 помогает избежать NPE
        phoneBook.containsKey("James"); // true
        phoneBook.containsValue("1234"); // false
        phoneBook.keySet(); // [James, Katy, Bob]
        phoneBook.values(); // [+1-202-555-0175, +1-202-555-0220, +1-202-555-0118]

        // HashMap - представляет собой карту подкрепления хэш-таблицыю
        Map<Integer, String> product = new HashMap<>();
        product.put(1000, "Notebook");
        product.put(2000, "Phone");
        product.put(3000, "keyboard");
        product.put(400, null);
        product.put(5000, "Phone");

        System.out.println(product); // {2000=Phone, 1000=Notebook, 3000=keyboard}
        product.get(1000); // "Notebook"
        product.putIfAbsent(3000, "Mouse"); // помещает значение, если этот к ключу еще не присвоено значение или null
        System.out.println(product.get(3000)); // keyboard
        product.putIfAbsent(400, "Mouse"); //{2000=Phone, 400=Mouse, 1000=Notebook, 3000=keyboard}
        product.containsKey(1000); // true
        product.containsValue("Book"); // false
        System.out.println(product.getOrDefault(100, "Default")); // выведет присвоенное значение или дефолт
        product.remove(3000);
        System.out.println(product); // {2000=Phone, 1000=Notebook}

        // LinkedHashMap - упорядочевает соответственно вводу
        Map<Integer, String> size = new LinkedHashMap<>();
        size.put(1000, "Moscow");
        size.put(700, "Berlin");
        size.put(1200, "Mumbai");
        System.out.println(size); // {1000=Moscow, 700=Berlin, 1200=Mumbai}

        // TreeMap - упорядочен по ключам
        // реализует SortedMap интерфейс
        SortedMap<LocalDate, String> event = new TreeMap<>();
        event.put(LocalDate.of(1995, 10, 20), "Renata");
        event.put(LocalDate.of(1994,04, 04), "Diana");
        event.put(LocalDate.of(1961, 06, 16), "Mom");
        event.put(LocalDate.of(1998, 11, 17), "Timur");
        event.put(LocalDate.of(1991,02, 22), "mine");
        System.out.println(event); // {1961-06-16=Mom, 1991-02-22=mine, 1994-04-04=Diana, 1995-10-20=Renata, 1998-11-17=Timur}
                                    // упорядочил по году
        LocalDate from = LocalDate.of(1994, 04, 04);
        LocalDate to = LocalDate.of(1998, 11, 17);
        event.subMap(from, to); // {1994-04-04=Diana, 1995-10-20=Renata}


        // перебор карт нельзя реализовать, тк они не являются итерируемыми объектами
        Map<String, String> phoneBook2 = Map.of(
                "Bob", "+1-202-555-0118",
                "James", "+1-202-555-0220",
                "Katy", "+1-202-555-0175"
        );
        for (String g : phoneBook2.keySet()) { // аналогично .values()
            System.out.println(g);
        }

        for (var entry : phoneBook2.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // мржно хранить Set можно только в Immutable Map (неизменных)
        Map<String, Set<String>> synonyms = new HashMap<>();
        synonyms.put("Do", Set.of("Execute"));
        synonyms.put("Make", Set.of("Set", "Attach"));
        synonyms.put("Keep", Set.of("Hold", "Calm"));

        System.out.println(synonyms); // {Keep=[Hold, Calm], Make=[Set, Attach], Do=[Execute]}

        // равенство карт
        // карты считаются равными, ели они содержат одинаковые ключи и значения, типы карт не важны
        Map<String, Integer> person1 = Map.of("Bob", 30, "John", 45);
        Map<String, Integer> person2 = new HashMap<>();
        person2.put("John", 45);
        person2.put("Bob", 30);
        Map<Integer, String> person3 = Map.of(30, "Bob", 45, "John");
        Objects.equals(person1, person2); // true
        Objects.equals(person3, person1); // false



    }
}
