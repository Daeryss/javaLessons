package pattern.creational.Creat03_abstractFactory.AF1_menu;

public class TuesdayFactory implements LunchFactory{
    @Override
    public HotDish createHotDish() {
        return new Puree();
    }

    @Override
    public Dessert createDessert() {
        return new IceCream();
    }
}
