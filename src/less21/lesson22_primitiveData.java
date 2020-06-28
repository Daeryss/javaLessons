package less21;

public class lesson22_primitiveData {
    public static void main(String[] args) {
        float f = 123.4f; // без f по умолчанию будет double тип
        long l = 12345L; // без L по умолчанию будет int тип
        // приведение типов бывает явное и не явное
        // неявное без объявления, от меньшего к большему, например:
        int x = 12;
        long i = x; // неявное
        // явное с объявлением, от большего к меньшему, если это вообще возможно:
        int y = (int) l; // явное

        // аналогично double и float
        int a = 123;
        double b = a; // неявно
        double d = 123.6;
        int p = (int) d; // 123 - откинул дробную часть
        long r = Math.round(d); // 124 - округлил



    }
}
