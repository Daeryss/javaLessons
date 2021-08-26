package pattern.behavioral.beh09_state.state01;

public class CloseSite extends StateBase{
    @Override
    public void connect(ConnectionContext context) {
        throw new RuntimeException("Connection is closed");
    }

    @Override
    public byte[] read(ConnectionContext context) {
        throw new RuntimeException("Connection is closed");
    }

    @Override
    public void close(ConnectionContext context) {
        throw new RuntimeException("Connection is closed");
    }
}
