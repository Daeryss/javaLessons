package pattern.creational.Creat05_prototype.Prot03_deep;

public class Main {
    public static void main(String[] args) {

        var color = new Color("#ffffff", "white", new ColorSetting("", 0.0));
        System.out.println("Color: " + color);
        System.out.println("ColorSetting: " + color.getSetting());

        var clone = color.clone();
        System.out.println("Clone: " + clone);
        System.out.println("ColorSetting: " + clone.getSetting());
    }
}
