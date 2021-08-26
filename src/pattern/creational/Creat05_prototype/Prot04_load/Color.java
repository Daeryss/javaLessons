package pattern.creational.Creat05_prototype.Prot04_load;


public abstract class Color implements Cloneable {
    private String code;
    private String name;

    public Color(String code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    protected Color clone() {
        try {
            final Color clone = (Color) super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
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
}
