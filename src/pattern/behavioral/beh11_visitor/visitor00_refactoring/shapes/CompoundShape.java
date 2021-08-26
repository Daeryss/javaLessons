package pattern.behavioral.beh11_visitor.visitor00_refactoring.shapes;

import pattern.behavioral.beh11_visitor.visitor00_refactoring.visitor.Visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape{
    public int id;
    public List<Shape> children = new ArrayList<>();

    public CompoundShape(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public void move(int x, int y) {
        x--;
        y++;
        System.out.printf("figure was moved x = %d, y = %d\n", x, y);
    }

    @Override
    public void draw() {
        System.out.println("this is compound shape");
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCompoundGraphic(this);
    }

    public void add(Shape shape) {
        children.add(shape);
    }
}
