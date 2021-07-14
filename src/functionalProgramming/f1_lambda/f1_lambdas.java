package functionalProgramming.f1_lambda;
/*
() -> () - основной оператор,
слева -список параметров, справа - тело лямбды
чтобы использовать лямбду надо написать функциональный интерфейс
с одним методом
 */
public class f1_lambdas {
    private static double value1 = 3, value2 = 4;

    public static void main(String[] args) {
        //with anonimus class before:
        Operation operation = new Operation() {
            @Override
            public double getResult(double value1, double value2) {
                return value1 * value2;
            }
        };
        System.out.println(operation.getResult(2, 3));

        //with lambda now:
        //слева - список параметров, справа - оператор
        //типы значений должны соответветствовать переопределенному методу
        Operation lambda = (value1, value2) ->  value1 + value2;
        System.out.println(lambda.getResult(4,5));


        //если лямбда принимает один параметр, то скобки можно опустить "(str) ->" = "str ->"
        //в данном примере мы переопределили метод print из интерфейса на System.out.println(str)
        Printer printer = str -> System.out.println(str);
        printer.print("hello world!");

        //блочные лямбда выражения
        Factorial factorial = value -> {
          int result = 1;
          for (int i = 1; i <=value; ++i) {
              result *= i;
          }
          return result;
        };

        System.out.println(factorial.getResult(5));


        //для методов без параметров лямбда пишется с пустыми скобками
        //переменные созданные на уровне метода можно использовать, но не изменять внутри лямбды

        Operation2 op = () -> {
            value1 = 100;
            return value1 + value2;
        };
        System.out.println(op.getResult());
        System.out.println(value1);
        System.out.println(value2);

    }
}
