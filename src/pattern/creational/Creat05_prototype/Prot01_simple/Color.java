package pattern.creational.Creat05_prototype.Prot01_simple;

public class Color {
    private String code;
    private String name;
    private ColorSetting setting;

    public Color(String code, String name, ColorSetting setting) {
        this.code = code;
        this.name = name;
        this.setting = setting;
    }

    public Color(Color color) {
        this(color.code, color.name, color.setting);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ColorSetting getSetting() {
        return setting;
    }

    public void setSetting(ColorSetting setting) {
        this.setting = setting;
    }
}
