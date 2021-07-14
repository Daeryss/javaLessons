package pattern.structural.decorator.coffeeShop;

public class Brandy extends CoffeeDecorator implements CoffeeIngredient{

    public Brandy(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("brandy");
        super.showIngredient();
    }
}
