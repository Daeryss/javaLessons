package pattern.behavioral.beh09_state.state00_refactoring.ui;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
        System.out.println("ready");
    }
}
