package pattern.creational.Creat02_factoryMethod.FM02_figure;

public class Rectangle implements Figure{
    @Override
    public String getPerimeter() {
        return "2 * (side A + side B)";
    }
}
