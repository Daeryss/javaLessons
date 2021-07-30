package pattern.creational.Creat02_factoryMethod.FM01_car;

public class BMW extends AbstractCar{
    protected BMW() {
    }

    @Override
    public void crash(Object context) {
        System.out.println("BMW was crashed");
    }
}
