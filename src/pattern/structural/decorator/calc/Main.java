package pattern.structural.decorator.calc;

public class Main {
    public static void main(String[] args) {
        Calc calc = new Calculator();

        System.out.println("initialize timer calc");
        calc = new TimerCalculator(calc);
        calculate(calc);


        System.out.println("initialize new logger calc");
        calc = new LoggerDecorator(calc);
        calculate(calc);


        System.out.println("initialize new cal with builder");
        calc = new DecoratorBuilder(calc)
                .withLogger()
                .withTimer()
                .build();
        calculate(calc);

    }

    private static void calculate(Calc calc) {
        calc.setFunction(aDouble -> aDouble * 2);
        var result = calc.calculate(3.0);
        System.out.println(result);
        System.out.println();
    }
}
