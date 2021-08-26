package pattern.behavioral.beh11_visitor.visitor01.after;

public class VisLongCactus extends VisHomeplants{
    public VisLongCactus() {
        super("VisLongCactus");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
