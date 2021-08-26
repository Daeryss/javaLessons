package pattern.behavioral.beh11_visitor.visitor01.before;

public class RoundCactus extends Cactus{
    public RoundCactus() {
        super("RoundCactus");
    }

    @Override
    public void watering() {
        System.out.println("Watering one time a month");
    }
}
