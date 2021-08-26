package pattern.creational.Creat02_factoryMethod.FM01_car;

public class Lada extends AbstractCar{
    protected Lada() {
    }

    @Override
    public void crash(Object context) {
        System.out.println("Lada was crashed");
    }
}
