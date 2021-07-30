package pattern.creational.Creat02_factoryMethod.FM02_figure;

public class Square implements Figure {
    @Override
    public String getPerimeter() {
        return "4 * side A";
    }
}
