package pattern.structural.decorator.coffe;

public class Milk implements CoffeeIngredient{
    @Override
    public void showIngredient() {
        System.out.println("Milk");
    }
}
