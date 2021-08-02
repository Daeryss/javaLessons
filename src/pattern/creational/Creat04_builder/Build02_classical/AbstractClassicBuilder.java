package pattern.creational.Creat04_builder.Build02_classical;



public abstract class AbstractClassicBuilder implements ClassicalBuilder{

    protected String name;
    protected String text;

    @Override
    public AbstractClassicBuilder setBody(String text) {
        this.text = text;
        return this;
    }

    @Override
    public File getResult() {
        return new File(name, text);
    }
}
