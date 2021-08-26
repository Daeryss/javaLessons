package pattern.behavioral.beh09_state.state00_refactoring.states;

import pattern.behavioral.beh09_state.state00_refactoring.ui.Player;

public class LockedState extends State{

    public LockedState(Player player) {
        super(player);
        player.setPlaying(false);
    }

    @Override
    public String onLock() {
        if(player.isPlaying()) {
            player.changeState(new ReadyState(player));
            return "stop playing";
        } else {
            return "Locked";
        }
    }

    @Override
    public String onPlay() {
        player.changeState(new ReadyState(player));
        return "Ready";
    }

    @Override
    public String onNext() {
        return "Locked";
    }

    @Override
    public String onPrevious() {
        return "Locked";
    }
}
