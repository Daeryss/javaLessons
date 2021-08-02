package pattern.creational.Creat04_builder.Build03_fluent;

public class CustomStringBuilder {
    private StringBuilder text;

    public CustomStringBuilder() {
        text = new StringBuilder();
    }

    public CustomStringBuilder append(String text) {
        this.text.append(text);
        return this;
    }

    public CustomStringBuilder appendLine(String text) {
        return append(text + '\n');
    }

    public CustomStringBuilder appendFormat(String template, Object... args) {
        return append(String.format(template, args));
    }

    public String getResult() {
        return text.toString();
    }
}
