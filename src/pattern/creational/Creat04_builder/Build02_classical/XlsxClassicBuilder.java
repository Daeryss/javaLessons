package pattern.creational.Creat04_builder.Build02_classical;

public class XlsxClassicBuilder extends AbstractClassicBuilder{
    @Override
    public AbstractClassicBuilder setFileName(String name) {
        this.name = name + ".xlsx";
        return this;
    }
}
