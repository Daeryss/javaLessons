package pattern.creational.Creat03_abstractFactory.AF1_menu;

import java.time.DayOfWeek;

public class LunchFactoryHelper {
    public static LunchFactory create(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return new MondayFactory();
            case TUESDAY:
                return new TuesdayFactory();
            case WEDNESDAY:
                return new WednesdayFactory();
            default:
                throw new RuntimeException("Menu isn't ready");
        }
    }
}
