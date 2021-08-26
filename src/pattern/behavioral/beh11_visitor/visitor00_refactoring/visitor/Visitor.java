package pattern.behavioral.beh11_visitor.visitor00_refactoring.visitor;

import pattern.behavioral.beh11_visitor.visitor00_refactoring.shapes.*;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
