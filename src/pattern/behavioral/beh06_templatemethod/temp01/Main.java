package pattern.behavioral.beh06_templatemethod.temp01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.charset.StandardCharsets;

public  class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.println("Input user name: ");
        String username = reader.readLine();
        System.out.println("Input password: ");
        String password = reader.readLine();

        System.out.println("Input message: ");
        String message = reader.readLine();
        System.out.println("\nChoose social network for posting message.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());
        if (choice == 1) {
            network = new Facebook(username, password);
        } else if (choice == 2) {
            network = new Twitter(username, password);
        }
        network.post(message);
    }

}
