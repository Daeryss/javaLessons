public class lesson10_forEach {
    public static void main(String[] args) {
        String[] str = new String[3];
        str[0] = "hello";
        str[1] = " dear ";
        str[2] = "friend";
        for(String string:str) { // перебирает все элементы в массиве
            System.out.print(string);
        }
    }
}
