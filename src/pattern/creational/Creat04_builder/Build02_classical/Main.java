package pattern.creational.Creat04_builder.Build02_classical;

public class Main {
    public static void main(String[] args) {
        var builders = new ClassicalBuilder[] {new PdfClassicBuilder(), new XlsxClassicBuilder()};

        for (ClassicalBuilder builder : builders) {
            var director = new ClassicBuilderDirector(builder);
            director.build("name_1", "text_1");
            var file = builder.getResult();
            System.out.println(file.toString());
        }
    }
}
