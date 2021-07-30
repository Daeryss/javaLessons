package pattern.creational.Creat03_abstractFactory.AF1_menu;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        var mondayFactory = new MondayFactory();
        printMenu(mondayFactory);

        var tuesdayFactory = new TuesdayFactory();
        printMenu(tuesdayFactory);

        printMenu(DayOfWeek.WEDNESDAY);
    }

    public static void printMenu(LunchFactory factory) {
        System.out.println("=====Today's menu=====");

        var dish = factory.createHotDish();
        System.out.printf("General food: %s\n", dish.getName());

        var desser = factory.createDessert();
        System.out.printf("Sweet: %s\n", desser.getName());
        System.out.println("======================");

    }

    private static void printMenu(DayOfWeek dayOfWeek) {
        var factory = LunchFactoryHelper.create(dayOfWeek);
        printMenu(factory);
    }
}
