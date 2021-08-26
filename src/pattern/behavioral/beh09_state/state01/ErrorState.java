package pattern.behavioral.beh09_state.state01;

public class ErrorState extends StateBase{
    @Override
    public void connect(ConnectionContext context) {
        throw new RuntimeException("Some error");
    }

    @Override
    public byte[] read(ConnectionContext context) {
        throw new RuntimeException("Some error");
    }

    @Override
    public void close(ConnectionContext context) {
        throw new RuntimeException("Some error");
    }
}
