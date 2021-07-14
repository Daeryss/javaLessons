package pattern.structural.decorator.coffe;

public class Main {
    public static void main(String[] args) {
        var coffee = new Coffee(new Milk());
        coffee.showIngredient();
    }
}
