/*
* ArrayList - массив с возможностью изменения, как размера, так и содержимого
* фактически, это расширенный класс массива. ArrayList может хранить лишь объекты
* ссылочного типа (String, Integer, Float и тд)
*/
import java.util.ArrayList;
import java.util.Collection;


public class lesson39_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(); // создает пустой массив, по умолчанию длина равна 10
        ArrayList<String> list2 = new ArrayList<>(50); // создает пустой массив, длина равна 50
        ArrayList<String> list3 = new ArrayList<>(list2); // можно создать массив, состоящий из объектов дрегого массива
        for(int i = 0; i < 20; i++) {
            list1.add(i);
        }
        list1.size(); // 20
        list1.add(20); // list1.size() = 21;
        list1.get(12); // 12
        list1.add(12, 888); // list1.get(12) = 888; list1.get(13) = 12...
        list1.remove(12); // list1.get(12) = 12
        list1.removeIf(i -> (i >18 && i < 20)); // удалит объекты, соответствующие условиям
        System.out.println(list1); //[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 20]
        list1.contains(34); // false
        list1.indexOf(5); // возвращает индекс первого вхождения элемента
        list1.set(2, 312); // замена элемента с индексом 2 на элемент 312
        list1.lastIndexOf(5); // возвращает индекс последнего вхождения элемента
        list1.add(2); // может хравнитб дубликаты элементов
        list1.add(2);


        Object[] numbers = list1.toArray(); // переведет в формат обычного массива
        for (Object num : numbers) {  // печать любого массива
            System.out.print(num + " ");
        }
        list1.clear(); // удалит все содержимое



    }
}
