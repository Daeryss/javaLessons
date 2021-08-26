package pattern.behavioral.beh11_visitor.visitor01.before;

public class Aloe extends HomePlants{
    public Aloe() {
        super("Aloe");
    }

    @Override
    public void watering() {
        System.out.println("Some watering");
    }

    @Override
    public void care() {
        System.out.println("Some care");
    }
}
