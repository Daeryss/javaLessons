package pattern.structural.decorator.calc;

import java.util.function.Function;

public class CalculatorIDecoratorBase implements Calc{

    protected Calc decoratee;

    public CalculatorIDecoratorBase(Calc decoratee) {
        this.decoratee = decoratee;
    }

    @Override
    public void setFunction(Function<Double, Double> func) {
        decoratee.setFunction(func);
    }

    @Override
    public double calculate(Double input) {
        input = onBeforeCalculate(input);
        var result = decoratee.calculate(input);
        return onAfterCalculate(result);
    }
    protected double onBeforeCalculate(double input) {
        return input;
    }

    protected double onAfterCalculate(double result) {
        return result;
    }
}
