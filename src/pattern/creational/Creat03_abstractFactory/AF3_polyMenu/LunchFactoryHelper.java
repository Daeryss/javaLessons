package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

import java.time.DayOfWeek;

public class LunchFactoryHelper {
    public static AbstractLunchFactory create(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY:
                return new MondayFactory();
            case THURSDAY:
                return new TuesdayFactory();
            default:
                throw new RuntimeException("Меню не применимо");
        }
    }
}
