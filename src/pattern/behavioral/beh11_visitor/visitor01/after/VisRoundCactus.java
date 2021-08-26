package pattern.behavioral.beh11_visitor.visitor01.after;

public  class VisRoundCactus extends VisHomeplants{

    public VisRoundCactus() {
        super("VisRoundCactus");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

