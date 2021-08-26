package pattern.behavioral.beh11_visitor.visitor01.after;

public abstract class VisHomeplants {
    public String name;

    public VisHomeplants(String name) {
        this.name = name;
    }

    public abstract void accept(Visitor visitor);

    public String getName() {
        return name;
    }
}
