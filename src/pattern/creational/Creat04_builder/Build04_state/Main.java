package pattern.creational.Creat04_builder.Build04_state;

public class Main {
    public static void main(String[] args) {
//        runStateBuilder();
        runFormalStateBuilder();
        runFormalStateBuilder();
    }

    private static void runStateBuilder() {
        var lunch = new LunchBuilder()
                .addEntree(EntreeType.CUTLET)
                .addSideDish(SideDishType.PUREE)
                .build();

        System.out.println("lunch 1");
        System.out.println(lunch);
        System.out.println();

        var lunch2 = new LunchBuilder
                .LunchSideDishBuilder(EntreeType.CUTLET)
                .addSideDish(SideDishType.PASTA)
                .build();

        System.out.println("lunch 2");
        System.out.println(lunch2);
        System.out.println();

    }

    private static void runFormalStateBuilder() {
        var lunch = new FormalLunchBuilder()
                .addEntree(EntreeType.STEAK)
                .addSideDish(SideDishType.PASTA)
                .build();

        System.out.println("lunch 3");
        System.out.println(lunch);
    }
}
