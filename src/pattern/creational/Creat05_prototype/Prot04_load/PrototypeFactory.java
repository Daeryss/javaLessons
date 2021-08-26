package pattern.creational.Creat05_prototype.Prot04_load;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private Map<String, Color> colors = new HashMap<>();
    public PrototypeFactory() {

    }

    //cloning
    public Color cloneColor(String type) {
        Color color = (colors.get(type)).clone();
        return color;
    }

    private void loadDefaultItems() {
        Color refColor = new RedColor("#FF0000");
        colors.put("RedColor", refColor);

        Color transparentRedColor = new TransparentRedColor("#FF0000", 50);
        colors.put("TransparentRedColor", transparentRedColor);
    }
}
