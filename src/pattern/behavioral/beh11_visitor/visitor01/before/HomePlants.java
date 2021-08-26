package pattern.behavioral.beh11_visitor.visitor01.before;

public abstract class HomePlants {
    private String name;

    public HomePlants(String name) {
        this.name = name;
    }

    public abstract void watering();

    public abstract void care();

    public String getName() {
        return name;
    }
}
