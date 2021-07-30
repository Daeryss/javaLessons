package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

public class TuesdayFactory extends AbstractLunchFactory {

    public TuesdayFactory() {
        super();
    }

    @Override
    public HotDish getHotDish() {
        return new Pasta();
    }

    @Override
    protected Double getHotDishCost(HotDish hotDish) {
        return 50.5;
    }

    @Override
    protected Double getDessertCost(Dessert dessert) {
        return 43.5;
    }

    @Override
    protected Dessert getDessert() {
        return new IceCream();
    }
}
