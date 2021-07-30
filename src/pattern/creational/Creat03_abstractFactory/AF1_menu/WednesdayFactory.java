package pattern.creational.Creat03_abstractFactory.AF1_menu;

public class WednesdayFactory implements LunchFactory{
    @Override
    public HotDish createHotDish() {
        return new Pasta();
    }

    @Override
    public Dessert createDessert() {
        return new Muffin();
    }
}
