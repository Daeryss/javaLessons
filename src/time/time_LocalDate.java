//The class LocalDate represents a single date
// in a YYYY-MM-dd format, such as 2017-11-25 or 2025-01-23 .


import java.time.LocalDate;

public class lesson49_LocalDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); // current date
        System.out.println(date);
        System.out.println(LocalDate.ofYearDay(2018, 234)); // 2018-08-22 show date of this day
        int lenOfYear = date.lengthOfYear(); // 365
        int dayOfMonth = date.getDayOfMonth(); // 4
        int month = date.getMonthValue(); // 9
        int dayOfYear = date.getDayOfYear(); // 248
        System.out.println(date.getYear()); // 2020


        LocalDate newDate = LocalDate.of(2018, 8, 12);
        System.out.println(newDate.plusDays(1)); //2018-08-13
        System.out.println(newDate.minusDays(1)); // 2018-08-11
        System.out.println(newDate.withYear(2019)); // 2016-08-12



    }
}
