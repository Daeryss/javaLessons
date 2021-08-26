package pattern.behavioral.beh11_visitor.visitor01.after;

public class WateringVisitor extends Visitor{

    public WateringVisitor() {
        super("Watering");
    }

    @Override
    public void visit(VisLongCactus cactus) {
        System.out.println("Watering with special salts");
    }

    @Override
    public void visit(VisAloe cactus) {
        System.out.println("Some watering");
    }

    @Override
    public void visit(VisRoundCactus cactus) {
        System.out.println("watering one time a month");
    }
}
