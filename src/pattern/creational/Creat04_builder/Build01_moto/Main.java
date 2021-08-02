package pattern.creational.Creat04_builder.Build01_moto;

public class Main {
    public static void main(String[] args) {
        Moto moto = new MotoBuilder().build("Honda");

        System.out.println(moto);

        moto = new MotoBuilder().build("Lada");
        System.out.println(moto);
    }
}
