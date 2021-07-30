package pattern.creational.Creat03_abstractFactory.AF3_polyMenu;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<MenuItem, Double> prizes = new HashMap<>();

    public void addToMenu(MenuItem menuItem, Double cost) {
        prizes.put(menuItem, cost);
    }

    Double getCost(MenuItem menuItem) {
        return prizes.get(menuItem);
    }
}
