/*
необходимость классов-оберток заключается в том, что у примитивных
типов данных (int, char, double, boolean и тд) нет мтеодов.
Все классы обертки перечислены ниже:
Double, Float, Long, Integer, Short, Byte, Character, Boolean
(представляют собой соответствующие классы, те объекты являются
представителями класса)
 */

public class lesson23_wrapperClass {
    public static void main(String[] args) {
        int x1 = 1;
        Integer x2 = new Integer(12);
        Integer x3 = 124; // автоупаковка, равноценна записи выше
        // у х1 нет методов, у х2 есть
        Integer.parseInt("1234"); // методы класса
        System.out.println(x3);
    }
}
