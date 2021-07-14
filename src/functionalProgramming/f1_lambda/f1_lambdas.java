package functionalProgramming.lambda;
/*
() -> () - основной оператор,
слева -список параметров, справа - тело лямбды

 */
public class f1_lambdas {
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
    }
}
