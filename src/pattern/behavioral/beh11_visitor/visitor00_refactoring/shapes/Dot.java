package pattern.behavioral.beh11_visitor.visitor00_refactoring.shapes;

import pattern.behavioral.beh11_visitor.visitor00_refactoring.visitor.Visitor;

public class Dot implements Shape{
    private int id;
    private int x;
    private int y;

    public Dot() {
    }

    public Dot(int id, int x, int y) {
        this.id = id;
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(int x, int y) {
        x++;
        y++;
        System.out.printf("figure was moved x = %d, y = %d\n", x, y);
    }

    @Override
    public void draw() {
        System.out.println("this is dot - .");
    }

    @Override
    public String accept(Visitor visitor) {
        return null;
    }

    public int getId() {
        return id;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
