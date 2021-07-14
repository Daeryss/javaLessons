package pattern.structural.decorator.calc;

import java.util.function.Function;

public class Calculator implements Calc {

    private Function<Double, Double> function;


    @Override
    public void setFunction(Function<Double, Double> function) {
        this.function = function;
    }

    @Override
    public double calculate(Double input) {
        return function.apply(input);
    }
}
