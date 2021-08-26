package pattern.behavioral.beh07_chain_of_responsability.chain00_refactoring.middleware;

public class RoleCheckMiddleware extends Middleware {
    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@example.com")) {
            System.out.println("hello admin");
            return true;
        }
        System.out.println("Hello user");
        return checkNext(email, password);
    }
}
