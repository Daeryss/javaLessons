public class lesson15_StringOperation {
    public static void main(String[] args) {
        String str = "hello"; // объекты классса String - неизменяемы
        str.toUpperCase();
        System.out.println(str);
        str = str.toUpperCase();
        System.out.println(str);
        StringBuilder x = new StringBuilder("hello"); // изменяемый объект
        x.append(" my").append(" friend");
        System.out.println(x.toString());

        // printf позволяет модифицировать выводимую строку
        System.out.printf("this is string, %s \n", str); // %s - string
        System.out.printf("this is num %d \n", 123); // %d - digit, число
        System.out.printf("this is float %f \n", 3.234);
        System.out.printf("%10d \n", 12);
        System.out.printf("%10d \n", 65432);
        System.out.printf("%-10dabc\n", 12);
        System.out.printf("%.3f", 3.4564764); // округляет и форматирует

    }
}
