package pattern.structural.decorator.coffeeShop;

public class Coffee extends CoffeeDecorator implements CoffeeIngredient{
    public Coffee(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("coffee");
        super.showIngredient();
    }
}
