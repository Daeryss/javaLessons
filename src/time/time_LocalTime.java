import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class lesson50_LocalTime {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); // current time
        System.out.println(time);
        LocalTime.of(11, 24); // 11:24
        LocalTime.of(17, 33, 45); // 17:33:45
        LocalTime.parse("11:33:45"); // 11:33:45
//        hours from 0 to 23
//        minutes and seconds from 0 to 59
//        nanosec from 0 to 999,999,999

        LocalTime timeFromSecond = LocalTime.ofSecondOfDay(12345); // 03:25:45
        LocalTime nanotime = LocalTime.ofNanoOfDay(1234567890); // 00:00:01.234567890
        System.out.println(LocalTime.MIN); // 00:00
        System.out.println(LocalTime.MAX); // 23:59:59.999999999
        System.out.println(LocalTime.NOON); // 12:00
        System.out.println(LocalTime.MIDNIGHT); // 00:00

        LocalTime t = LocalTime.of(14, 33, 54);
        System.out.println(t); // 14:33:54
        t.getHour(); // 14
        t.getMinute(); // 33
        t.getSecond(); // 54
        t.getNano(); // 0
        t.toSecondOfDay(); // 52434

        System.out.println(t.plusHours(2)); // 16:33:54 don't change var
        System.out.println(t.plusMinutes(200)); //17:53:54
        System.out.println(t.plusSeconds(213413)); // 01:50:47

        System.out.println(t.withHour(12)); // 12:33:54
        System.out.println(t.withMinute(12)); // 14:12:54
        System.out.println(t.withSecond(12)); // 14:33:12

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(t.format(dtf)); // 14:33

    }
}
