package pattern.behavioral.beh09_state.state01;

public class ReadState extends StateBase{
    @Override
    public void connect(ConnectionContext context) {

    }

    @Override
    public byte[] read(ConnectionContext context) {
        return new byte[0];
    }
}
