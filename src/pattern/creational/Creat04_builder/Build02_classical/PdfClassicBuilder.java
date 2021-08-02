package pattern.creational.Creat04_builder.Build02_classical;

public class PdfClassicBuilder extends AbstractClassicBuilder{
    @Override
    public AbstractClassicBuilder setFileName(String name) {
        this.name = name + ".pdf";
        return this;
    }
}
