package pattern.behavioral.beh09_state.state01;

public class ConnectionContext {
    String url;
    public State state;

    public ConnectionContext(String url) {
        this.url = url;
        this.state = new InitState();
    }

    public void connect() {
        state.connect(this);
    }

    public byte[] read() {
        return state.read(this);
    }

    public void close() {
        state.close(this);
    }
}
