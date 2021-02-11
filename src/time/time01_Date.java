package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class time01_Date {
    public static void main(String[] args) {
        Date date = new Date();

        System.out.println(date.getTime()); //Возвращает количество миллисекунд, истекших с 1 января 1970 года.
        System.out.println(date.toString());

        Date dateNow = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");

        System.out.println("Текущая дата " + formatForDateNow.format(dateNow));

        String str = String.format("Текущая дата и время: %tc", date);

        System.out.println(str);
        str = String.format("%1$s %2$td %2$tB %2$tY", "Дата:", date);
        System.out.println(str);



        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
        str = args.length == 0 ? "2011-11-11" : args[0];

        System.out.print("Строка " + str + " распаршена как ");
        Date parsingDate;
        try {
            parsingDate = ft.parse(str);
            System.out.println(parsingDate);
        }catch (ParseException e) {
            System.out.println("Нераспаршена с помощью " + ft);
        }

        try {
            System.out.println(new Date() + "\n");
            //Thread.sleep(1000); // Замораживает весь поток на 10 секунд
            TimeUnit.SECONDS.sleep(2); // не вызывает ошибок
            System.out.println(new Date() + "\n");
        } catch (Exception e) {
            System.out.println("Получили исключение!");
        }

        // Начала отсчета
        long start = System.currentTimeMillis();

        // Код программы. Получение 10 случайных чисел от 0 до 9 и вывод на экран
        for(int i = 1;i <= 10;i++) {
            System.out.println("Случайное число №" + i + ": " + (int)(Math.random() * 10));
        }

        // Получение и запись в переменную timeWorkCode времени работы программы
        long timeWorkCode = System.currentTimeMillis() - start;
        // Вывод времени выполнения работы кода на экран
        System.out.println("Скорость выполнения программы: " + timeWorkCode + " миллисекунд");

        try {
            long start2 = System.currentTimeMillis();
            System.out.println(new Date() + "\n");

            Thread.sleep(10000);
            System.out.println(new Date() + "\n");

            long end = System.currentTimeMillis();
            long diff = end - start2;
            System.out.println("Разница между датами: " + diff + " миллисекунд");
        }catch (Exception e) {
            System.out.println("Получили исключение!");
        }
    }
}
