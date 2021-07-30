package pattern.creational.Creat02_factoryMethod.FM01_car;

public class CarFactory {

    public static AbstractCar createCar(String carName) {
        switch (carName) {
            case "Lada":
                return new Lada();
            default:
                return new BMW();
        }
    }
}
