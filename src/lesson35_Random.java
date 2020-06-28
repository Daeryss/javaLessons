/*
* класс random генерирует псевдослучайные значения int, long, double, boolean
*/

import java.util.Random;

public class lesson35_Random {
    public static void main(String[] args) {
        Random random = new Random();
        Random random1 = new Random(1000); // позволяет указать начальное число вручную seed = 1000
        int n1 = random.nextInt(); // возвращает псевдослучайное значение всегда разное
        int n6 = random1.nextInt(); // возвращает псевдослучайное значение всегда одно и тоже
        int n2 = random.nextInt(20); //  возвращает значение 0 <= n2 < 20
        long n3 = random.nextLong();
        double n4 = random.nextDouble(); // от 0.0 до 1.0
        double n5 = random.nextGaussian(); // возвращает следующее случайное значение гауссова случайного числа,
                                        // т.е. значения, центрированное по 0.0 со стандартным отклонением в 1.0
                                        // (кривая нормального распределения)
        byte[] bytes = new byte[4];
        random.nextBytes(bytes); // заполнит массив случайными байтами (только с байтами работает)
        for (byte b : bytes) {
            System.out.println(b);
        }
        // для создания числа из заданного диапозона:
        int lower = 5; // начало диапозона
        int upper = 10; // конец диапозона
        int ans = random.nextInt(upper - lower + 1) + lower; // "+1" - для того, чтобы верхнее число входило в диапозон
                                                // в данном примере будет случайное число от 0 до 5 и прибавление к нему 5, как начальной точки
        Random random2 = new Random(1000);
        int n9 = random2.nextInt(46);
        System.out.println("n9 = " + n9);
    }
}
