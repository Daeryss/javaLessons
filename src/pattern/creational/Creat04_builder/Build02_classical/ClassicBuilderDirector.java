package pattern.creational.Creat04_builder.Build02_classical;

public class ClassicBuilderDirector {
    private ClassicalBuilder classicalBuilder;

    public ClassicBuilderDirector(ClassicalBuilder classicalBuilder) {
        this.classicalBuilder = classicalBuilder;
    }

    public void build(String name, String text) {
        classicalBuilder.setFileName(name);
        classicalBuilder.setBody(text);
    }
}
