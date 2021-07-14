package pattern.structural.decorator.coffe;

public class Sugar implements CoffeeIngredient{
    @Override
    public void showIngredient() {
        System.out.println("Sugar");
    }
}
