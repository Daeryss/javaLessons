package pattern.structural.decorator.coffe;

public class Coffee extends CoffeeDecorator{

    public Coffee(CoffeeIngredient innerIngredient) {
        super(innerIngredient);
    }

    @Override
    public void showIngredient() {
        System.out.println("Coffee");
        super.showIngredient();
    }
}
