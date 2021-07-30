package pattern.creational.Creat02_factoryMethod.FM02_figure;

public class FigureFactory {
    static Figure getShape (String figureType){
        switch (figureType){
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            case "square":
                return new Square();
            default:
                return null;
        }
    }
}
