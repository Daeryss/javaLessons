package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

public class MondayFactory extends AbstractLunchFactory {

    public MondayFactory() {
        super();
    }

    @Override
    public HotDish getHotDish() {
        return new Puree();
    }

    @Override
    protected Double getHotDishCost(HotDish hotDish) {
        return 40.5;
    }

    @Override
    protected Double getDessertCost(Dessert dessert) {
        return 70.5;
    }

    @Override
    protected Dessert getDessert() {
        return new Muffin();
    }
}
