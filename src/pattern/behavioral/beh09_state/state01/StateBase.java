package pattern.behavioral.beh09_state.state01;

public abstract class StateBase implements State{

    @Override
    public abstract void connect(ConnectionContext context);

    @Override
    public abstract byte[] read(ConnectionContext context);

    @Override
    public void close(ConnectionContext context) {
        context.state = new CloseSite();
    }
}
