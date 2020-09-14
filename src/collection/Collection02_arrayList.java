/*
коллекции - те же массивы, но с большим функционалом.
Мы можем расширять коллекции до неопределенного размера, в отличии от массива
могут быть изменяемыми (можно добавить или удалить элемент) или неизменными

коллекции хранят только ссылочный тип данных, но не могут хранить примитивные, те:
ArrayList<String> list, ArrayList<Integer> list, ArrayList<Double> list - можно
ArrayList<int> list - нельзя
 */

import java.util.ArrayList;

public class lesson31_arrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(); // создали коллекцию

        list.add("first");
        list.add("second");
        list.add("third");
        System.out.println(list); // [first, second, third]

        System.out.println(list.get(1)); // second
                        // возврат элемента только через .get(), через [] нельзя
        list.remove("first");
        System.out.println(list); // [second, third]
        System.out.println(list.size()); // 2

    }
}
