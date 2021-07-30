package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        LunchFactory lunchFactory = LunchFactoryHelper.create(DayOfWeek.MONDAY);
        lunchFactory.createDessert();
        lunchFactory.createHotDish();
        lunchFactory.getMenu();
    }
}
