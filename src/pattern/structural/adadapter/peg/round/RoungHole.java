package pattern.structural.adadapter.peg.round;

public class RoungHole {
    private double radiius;

    public RoungHole(double radiius) {
        this.radiius = radiius;
    }

    public double getRadiius() {
        return radiius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = (this.getRadiius() >= peg.getRadius());
        return result;
    }
}
