
package ST10318621;
import java.util.Scanner;
/**
 * GitHub link to my repository- https://github.com/EthanDona/ST10318621-PROG5121-POE/tree/main
 * @author Ethan Donaldson ST10318621
 */
public class ST10318621 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Login login = new Login();
    Scanner scanner = new Scanner(System.in);

        OUTER:
        while (true) {
            System.out.println("Welcome to the Login System. Enter your choice:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    {
                        //registering a user
                        System.out.println("Enter your first name:");
                        String firstName = scanner.next();
                        System.out.println("Enter your last name:");
                        String lastName = scanner.next();
                        System.out.println("Enter your username:");
                        String username = scanner.next();
                        System.out.println("Enter your password:");
                        String password = scanner.next();
                        login.registerUser(firstName, lastName, username, password);
                        break;
                    }
                case 2:
                    {
                        //logging in a user
                        System.out.println("Enter your username:");
                        String username = scanner.next();
                        System.out.println("Enter your password:");
                        String password = scanner.next();
                        if (login.loginUser(username, password)) {
                            System.out.println("Welcome user it is great to see you" );
                        } else {
                            System.out.println("Login failed. Please check your username and password.");
                        }       break;
                    }
                case 3:
                    System.out.println("Goodbye!");
                    break OUTER;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    break;
            }
        }
    }
}
