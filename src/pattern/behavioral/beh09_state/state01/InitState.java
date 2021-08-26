package pattern.behavioral.beh09_state.state01;

public class InitState extends StateBase{
    @Override
    public void connect(ConnectionContext context) {
        System.out.println("Connection to " + context.url);
        context.state = new ReadState();
    }

    @Override
    public byte[] read(ConnectionContext context) {
        throw new RuntimeException("Connection is not opened");
    }
}
