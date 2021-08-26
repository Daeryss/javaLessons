package pattern.behavioral.beh09_state.state01;

public interface State {
    void connect(ConnectionContext context);

    byte[] read (ConnectionContext context);

    void close (ConnectionContext context);
}
