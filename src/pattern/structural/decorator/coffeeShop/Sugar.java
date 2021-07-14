package pattern.structural.decorator.coffeeShop;

public class Sugar extends CoffeeDecorator implements CoffeeIngredient{
    public Sugar(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("sugar");
        super.showIngredient();
    }
}
