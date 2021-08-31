package pattern.behavioral.beh06_templatemethod.temp01;

import java.nio.charset.StandardCharsets;

public abstract class Network {
    String userName;
    String password;

    public Network() {
    }

    /**
     * Публикация данных в любой сети.
     */

    public boolean post(String message) {
        // Проверка данных пользователя перед постом в соцсеть. Каждая сеть для
        // проверки использует разные методы
        if(logIn(this.userName, this.password)) {
            // Отправка данных.
            boolean result = sendData(message.getBytes(StandardCharsets.UTF_8));
            logOut();
            return result;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract void logOut();
    abstract boolean sendData(byte[] data);
}
