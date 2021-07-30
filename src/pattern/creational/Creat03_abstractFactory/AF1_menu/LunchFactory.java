package pattern.creational.Creat03_abstractFactory.AF1_menu;

public interface LunchFactory {
    HotDish createHotDish();
    Dessert createDessert();
}
