public class lesson05_ElseIf {
    public static void main(String[] args) {
        int i = 15;
        while(i > 0){
            if (i % 2 == 0){
                System.out.println("it is even num " + i);
            } else {
                System.out.println("it is odd num " + i);
            }
            i -= 3;
        }
    }
}
