package pattern.behavioral.beh11_visitor.visitor01.after;

public class CareVisitor extends Visitor {
    public CareVisitor() {
        super("Caring");
    }

    @Override
    public void visit(VisLongCactus cactus) {
        System.out.println("Add nutrients for long cactus");
    }

    @Override
    public void visit(VisAloe cactus) {
        System.out.println("SomeCare");
    }

    @Override
    public void visit(VisRoundCactus cactus) {
        System.out.println("add nutrients for round cactus");
    }
}
