package pattern.behavioral.beh11_visitor.visitor01.after;

public abstract class Visitor {
    private String operationName;

    public Visitor(String operationName) {
        this.operationName = operationName;
    }

    public abstract void visit(VisLongCactus cactus);

    public abstract void visit(VisAloe cactus);

    public abstract void visit(VisRoundCactus cactus);

    public String getOperationName() {
        return operationName;
    }
}
