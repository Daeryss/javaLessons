package pattern.behavioral.beh11_visitor.visitor01.after;

public class VisAloe extends VisHomeplants{
    public VisAloe() {
        super("VisAloe");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
