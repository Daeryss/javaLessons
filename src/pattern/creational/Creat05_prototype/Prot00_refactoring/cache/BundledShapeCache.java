package pattern.creational.Creat05_prototype.Prot00_refactoring.cache;

import pattern.creational.Creat05_prototype.Prot00_refactoring.shapes.Circle;
import pattern.creational.Creat05_prototype.Prot00_refactoring.shapes.Rectangle;
import pattern.creational.Creat05_prototype.Prot00_refactoring.shapes.Shape;

import java.util.HashMap;
import java.util.Map;

/**
* Вы можете добавить в программу фабрику прототипов,
* которая будет хранить каталог прототипов. Таким образом,
* вы сможете запрашивать у фабрики новые объекты, описывая
* нужные вам свойства. Фабрика будет искать соответствующий
* прототип в кеше и возвращать вам копию.
 */


public class BundledShapeCache {
    private Map<String, Shape> cache = new HashMap<>();

    public BundledShapeCache() {
        Circle circle = new Circle();
        circle.x = 5;
        circle.y = 7;
        circle.radius = 45;
        circle.color = "Green";

        Rectangle rectangle = new Rectangle();
        rectangle.x = 6;
        rectangle.y = 9;
        rectangle.width = 8;
        rectangle.height = 10;
        rectangle.color = "Blue";

        cache.put("Big green circle", circle);
        cache.put("Medium blue rectangle", rectangle);
    }

    public Shape put(String key, Shape shape) {
        cache.put(key, shape);
        return shape;
    }

    public Shape get (String key) {
        return cache.get(key).clone();
    }
}
