package pattern.creational.Creat04_builder.Build02_classical;


public interface ClassicalBuilder {
    AbstractClassicBuilder setFileName(String name);
    AbstractClassicBuilder setBody(String text);
    File getResult();
}
