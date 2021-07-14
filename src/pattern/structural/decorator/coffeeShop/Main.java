package pattern.structural.decorator.coffeeShop;

public class Main {
    public static void main(String[] args) {
        Coffee coffee =
                new Coffee(
                        new Milk(
                                new Sugar(null)
                        )
                );
        coffee.showIngredient();
    }
}
