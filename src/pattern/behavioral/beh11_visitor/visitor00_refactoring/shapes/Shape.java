package pattern.behavioral.beh11_visitor.visitor00_refactoring.shapes;

import pattern.behavioral.beh11_visitor.visitor00_refactoring.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
