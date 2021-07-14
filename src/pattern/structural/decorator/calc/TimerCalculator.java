package pattern.structural.decorator.calc;

public class TimerCalculator extends CalculatorIDecoratorBase{

    private long watch;

    public TimerCalculator(Calc decoratee) {
        super(decoratee);
    }

    protected double onBeforeCalculate(double input) {
        watch = System.currentTimeMillis();
        return super.onBeforeCalculate(input);
    }

    protected double onAfterCalculate(double result) {
        System.out.printf("Computed complete: %s ms", System.currentTimeMillis() - watch);
        System.out.println();
        return super.onAfterCalculate(result);
    }
}
