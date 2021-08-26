package pattern.creational.Creat05_prototype.Prot02_clone;

public class ColorSetting {

    private String brightness;
    private Double transparency;

    public ColorSetting(String brightness, Double transparency) {
        this.brightness = brightness;
        this.transparency = transparency;
    }

    public String getBrightness() {
        return brightness;
    }

    public void setBrightness(String brightness) {
        this.brightness = brightness;
    }

    public Double getTransparency() {
        return transparency;
    }

    public void setTransparency(Double transparency) {
        this.transparency = transparency;
    }
}
