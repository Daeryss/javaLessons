package pattern.behavioral.beh11_visitor.visitor01.before;

public class LongCactus extends Cactus{
    public LongCactus() {
        super("LongCactus");
    }

    @Override
    public void watering() {
        System.out.println("Watering with special salts");
    }
}
