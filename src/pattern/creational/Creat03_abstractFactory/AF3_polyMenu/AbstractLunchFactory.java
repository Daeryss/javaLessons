package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

public abstract class AbstractLunchFactory implements LunchFactory {

    protected Menu menu;

    public AbstractLunchFactory() {
        this.menu = new Menu();
    }

    @Override
    public HotDish createHotDish() {
        HotDish hotDish = getHotDish();
        menu.addToMenu(hotDish, getHotDishCost(hotDish));
        return hotDish;
    }

    public abstract HotDish getHotDish();

    protected abstract Double getHotDishCost(HotDish hotDish);

    @Override
    public Dessert createDessert() {
        Dessert dessert = getDessert();
        menu.addToMenu(dessert, getDessertCost(dessert));
        return dessert;
    }

    protected abstract Dessert getDessert();

    protected abstract Double getDessertCost(Dessert dessert);

    @Override
    public Menu getMenu() {
        return menu;
    }
}
