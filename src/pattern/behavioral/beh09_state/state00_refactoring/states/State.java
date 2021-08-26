package pattern.behavioral.beh09_state.state00_refactoring.states;

import pattern.behavioral.beh09_state.state00_refactoring.ui.Player;

public abstract class State {
    Player player;

    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}
