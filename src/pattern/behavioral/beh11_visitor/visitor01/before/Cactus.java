package pattern.behavioral.beh11_visitor.visitor01.before;

public abstract class Cactus  extends HomePlants{
    public Cactus(String name) {
        super(name);
    }

    @Override
    public void care() {
        System.out.println("add nutrients for cactus");
    }
}
