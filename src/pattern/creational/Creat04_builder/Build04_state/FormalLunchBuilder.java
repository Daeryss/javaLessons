package pattern.creational.Creat04_builder.Build04_state;

public class FormalLunchBuilder {

    public First_Interface addEntree(EntreeType entree) {
        return new FirstBuilder(entree);
    }

    private class FirstBuilder implements First_Interface {
        private EntreeType entree;

        public FirstBuilder(EntreeType entree) {
            this.entree = entree;
        }

        @Override
        public Second_Interface addSideDish(SideDishType sideDish) {
            return new SecondBuilder(entree, sideDish);
        }
    }

    private class SecondBuilder implements Second_Interface {
        private EntreeType entreeType;
        private SideDishType sideDish;

        public SecondBuilder(EntreeType entreeType, SideDishType sideDish) {
            this.entreeType = entreeType;
            this.sideDish = sideDish;
        }

        @Override
        public String build() {
            return String.format("{entreeType=%s, sideDish=%s}", entreeType, sideDish);
        }
    }

    public interface First_Interface {
        Second_Interface addSideDish(SideDishType sideDish);
    }

    public interface Second_Interface {
        String build();
    }
}
