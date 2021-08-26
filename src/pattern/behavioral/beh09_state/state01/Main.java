package pattern.behavioral.beh09_state.state01;

public class Main {
    public static void main(String[] args) {
        var context1 = new ConnectionContext("url_1");
        context1.connect();
        context1.read();
        context1.close();
        System.out.println();

        try {
            var context2 = new ConnectionContext("url_2");
            context2.read();
        } catch (Exception e) {
            System.out.println("context2: " + e.getMessage());
        }
        System.out.println();

        try {
            var context3 = new ConnectionContext("url_3");
            context3.connect();
            context3.close();
            context3.read();
        } catch (Exception e) {
            System.out.println("context3: " + e.getMessage());
        }
    }
}
