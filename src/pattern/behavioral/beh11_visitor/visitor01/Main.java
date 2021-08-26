package pattern.behavioral.beh11_visitor.visitor01;

import pattern.behavioral.beh11_visitor.visitor01.after.*;
import pattern.behavioral.beh11_visitor.visitor01.before.Aloe;
import pattern.behavioral.beh11_visitor.visitor01.before.HomePlants;
import pattern.behavioral.beh11_visitor.visitor01.before.LongCactus;
import pattern.behavioral.beh11_visitor.visitor01.before.RoundCactus;

public class Main {
    public static void main(String[] args) {
        //before
        HomePlants[] homePlants = {new LongCactus(), new RoundCactus(), new Aloe()};
        for (HomePlants homePlant : homePlants) {
            homePlant.care();
            homePlant.watering();
        }

        System.out.println("\n******************\n");

        //after
        VisHomeplants[] homePlants2 = {
                new VisLongCactus(),
                new VisRoundCactus(),
                new VisAloe()
        };

        var careVisitor = new CareVisitor();
        var waterVisitor = new WateringVisitor();
        for (VisHomeplants plant : homePlants2) {
            plant.accept(careVisitor);
            plant.accept(waterVisitor);
        }
    }
}
