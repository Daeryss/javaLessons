package pattern.structural.decorator.coffe;

public class Brandy implements CoffeeIngredient{
    @Override
    public void showIngredient() {
        System.out.println("Brandy");
    }
}
