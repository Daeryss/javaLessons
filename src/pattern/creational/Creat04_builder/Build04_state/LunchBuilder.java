package pattern.creational.Creat04_builder.Build04_state;

public class LunchBuilder {

    public LunchSideDishBuilder addEntree(EntreeType entree) {
        return new LunchSideDishBuilder(entree);
    }

    public static class LunchSideDishBuilder {
        private EntreeType entree;

        public LunchSideDishBuilder(EntreeType entree) {
            this.entree = entree;
        }

        public FinalLunchBuilder addSideDish(SideDishType sideDish) {
            return new FinalLunchBuilder(entree, sideDish);
        }
    }

    public static class FinalLunchBuilder {
        private EntreeType entree;
        private SideDishType sideDish;

        public FinalLunchBuilder(EntreeType entree, SideDishType sideDish) {
            this.entree = entree;
            this.sideDish = sideDish;
        }

        public String build() {
            return String.format("{entree=%s, sideDish=%s}", entree, sideDish);
        }
    }
}
