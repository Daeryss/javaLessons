package reflectionAPI;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection_2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {

        String className1 = "reflectionAPI.Person";
        String className2 = "java.lang.String";
        String methodName = "setName";


        /**получили объекты класса Class, соответствующие Person и String*/
        Class classObject1 = Class.forName(className1);
        Class classObject2 = Class.forName(className2);

        Method method1 = classObject1.getMethod(methodName, classObject2);

        /**получили объекты класса Object, соответствующие Person и String, то есть объекты o1 = person и o2 = string*/
        Object o1 = classObject1.newInstance();
        Object o2 = classObject2.getConstructor(String.class).newInstance("String value");

        method1.invoke(o1, o2);
        System.out.println(o1);
    }
}
