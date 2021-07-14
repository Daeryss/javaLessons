package pattern.structural.decorator.calc;

import java.util.function.Function;

public interface Calc {

    void setFunction(Function<Double, Double> func);

    double calculate(Double input);
}
