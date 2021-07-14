package pattern.structural.decorator.calc;

public class DecoratorBuilder {
    private Calc calc;

    public DecoratorBuilder(Calc calc) {
        this.calc = calc;
    }

    public DecoratorBuilder withTimer() {
        calc = new TimerCalculator(calc);
        return this;
    }

    public DecoratorBuilder withLogger() {
        calc = new LoggerDecorator(calc);
        return this;
    }

    public Calc build() {
        return calc;
    }
}
