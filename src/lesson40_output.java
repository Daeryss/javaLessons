public class lesson40_output {
    public static void main(String[] args) {
        System.out.println("hello world!"); // выводит и переносит строку
        System.out.print("hello world!\n"); // выводит и не переносит строку
        System.out.printf("hello %20s\n", "world"); // выводит и не переносит строку.
        // %s - string, %d - digit, %f - float (6 знаков после запятой по умолчанию)
        // %.3f - округлит число до 3го знака после запятой
        //%10d - выделит под число (аналогично все остальное) 10 знаков, упорядочит слева
        //%-10d - выделит под число (аналогично все остальное) 10 знаков, упорядочит справа
        // %c - char
        // %n == \n - новая строка
        System.out.printf("it if float %f\n", 4.234);
        // по аналогии можно предварительно отформатировать строку
        String str = String.format("Hello! My name is %s, %ni'm %d years old and my height is %.1f sm", "John", 12, 153.35);
        System.out.println(str);
        // также можно комбинировать методы
        String name = "My name is %c. %s ";
        String age ="My age is %d ";
        String height = "My height is %.2fm";
        System.out.println(String.format(name + age + height, 'M', "Anderson", 22, 1.53986));
    }
}
