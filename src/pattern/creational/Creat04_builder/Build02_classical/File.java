package pattern.creational.Creat04_builder.Build02_classical;

import java.text.MessageFormat;

public class File {
    private String name;
    private String text;

    public File(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return MessageFormat.format("File'{'name=''{0}'', text=''{1}'''}'", name, text);

    }
}
