import java.util.Scanner;

public class Login {
    public boolean authenticate() {
        
        @SuppressWarnings("resource")

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (User.validateUser(username, password)) {
            System.out.println("Login successful!");
            return true;
        } else {
            System.out.println("Invalid username or password.");
            return false;
        }
    }
}
