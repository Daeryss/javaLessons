package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

public interface LunchFactory {

    HotDish createHotDish();

    Dessert createDessert();

    Menu getMenu();
}
