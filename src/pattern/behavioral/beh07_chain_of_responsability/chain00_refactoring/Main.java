package pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring;

import pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring.middleware.Middleware;
import pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring.middleware.RoleCheckMiddleware;
import pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring.middleware.ThrottlingMiddleware;
import pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring.middleware.UserExistMiddleware;
import pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.management.BufferPoolMXBean;

public class Main {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Server server;

    public static void main(String[] args) throws IOException {
        init();

        boolean success;

        do {
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("input password: ");
            String password = reader.readLine();
            success = server.logIn(email, password);
        } while (!success);
    }

    public static void init() {
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        /**
         * Проверки связаны в одну цепь. Клиент может строить различные цепи,
         * используя одни и те же компоненты.
         */
        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        // Сервер получает цепочку от клиентского кода.
        server.setMiddleware(middleware);
    }
}
