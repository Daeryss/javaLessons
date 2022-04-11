package reflectionAPI;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;
import java.util.Arrays;

public class reflection_1 {
    public static void main(String[] args) throws ClassNotFoundException {
        /** так как все классы наследуются от объекта Class, в Java возможна такая структура,
         * таким образом мы получили объект класса Class. (не объект класса Person)
         */
        Class personClass = Person.class;
        System.out.println(personClass.getSimpleName()); // Person

        /** аналогично записи выше*/
        Person person = new Person();
        Class personClass2 = person.getClass();

        Class personClass3 = Class.forName("reflectionAPI.Person");

        /** возвращает все открытые методы */
        Method[] methods1 = personClass.getMethods();
        for (Method m : methods1) {
            System.out.println(m.getName() + ", "
                    + m.getReturnType().getSimpleName() + ", "
                    + Arrays.toString(m.getParameterTypes()));
        }


        /** возвращает все методы даже privat */

        System.out.println("\ngetDeclaredMethods(): ");
        Method[] methods2 = personClass.getDeclaredMethods();
        for (Method m : methods2) {
            System.out.println(m.getName() + ", "
                    + m.getReturnType().getSimpleName() + ", "
                    + Arrays.toString(m.getParameterTypes()));
        }

        System.out.println("\n getFields()");
        Field[] fields1 = personClass.getFields();
        for(Field f : fields1)
            System.out.println(f);

        System.out.println("\ngetDeclaredFields() - получим даже private поля");
        Field[] fields2 = personClass.getDeclaredFields();
        for(Field f : fields2)
            System.out.println(f);

    }
}
