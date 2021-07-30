package pattern.creational.Creat02_factoryMethod.FM02_figure;

public class Circle implements Figure{
    @Override
    public String getPerimeter() {
        return "Math.PI * 2 * radius";
    }
}
