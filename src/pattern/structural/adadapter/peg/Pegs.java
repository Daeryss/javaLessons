package pattern.structural.adadapter.peg;

import pattern.structural.adadapter.peg.adapter.SquarePegAdapter;
import pattern.structural.adadapter.peg.round.RoundPeg;
import pattern.structural.adadapter.peg.round.RoungHole;
import pattern.structural.adadapter.peg.square.SquarePeg;

public class Pegs {
    public static void main(String[] args) {
        RoungHole hole = new RoungHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);

        if(hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if(!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }
    }
}
