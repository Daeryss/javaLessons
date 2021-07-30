package pattern.creational.Creat02_factoryMethod.FM02_figure;

public class Main {
    public static void main(String[] args) {
        Figure circle = FigureFactory.getShape("circle");
        System.out.println(circle.getPerimeter());

        Figure rectangle = FigureFactory.getShape("rectangle");
        System.out.println(rectangle.getPerimeter());

        Figure square = FigureFactory.getShape("square");
        System.out.println(square.getPerimeter());
    }
}
