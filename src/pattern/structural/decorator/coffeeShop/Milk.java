package pattern.structural.decorator.coffeeShop;

public class Milk extends CoffeeDecorator implements CoffeeIngredient{

    public Milk(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("milk");
        super.showIngredient();
    }
}
