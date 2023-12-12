import java.util.Scanner;

public class ValidatorTest {
    public static void main(String[] args) {
        // Create an instance of the Validator class
        Validator validator = new Validator();

        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Print out the prompt for the user
        System.out.println("Enter your charge account number:");

        // Read the charge account number
        int number = scanner.nextInt();

        // Check if the number is valid
        if (validator.isValid(number)) {
            System.out.println("That's a valid account number.");
        } else {
            System.out.println("That's an INVALID account number.");
        }

        // Close the scanner
        scanner.close();
    }
}
