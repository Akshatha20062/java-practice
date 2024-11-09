
import java.util.Scanner;

public class first_divisible_number{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get the range end and divisor from the user
            System.out.print("Enter the end of the range (n): ");
            int n = scanner.nextInt();

            System.out.print("Enter the divisor (d): ");
            int d = scanner.nextInt();

            // Validate input values
            if (n < 1) {
                System.out.println("The end of the range must be at least 1.");
                return;
            }

            if (d <= 0) {
                System.out.println("The divisor must be a positive number.");
                return;
            }

            // Find the first divisible number
            int result = findFirstDivisible(1, n, d);

            // Display the result
            if (result != -1) {
                System.out.println("The first number between 1 and " + n + " that is divisible by " + d + " is " + result + ".");
            } else {
                System.out.println("No number between 1 and " + n + " is divisible by " + d + ".");
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integer values.");
        } finally {
            scanner.close();
        }
    }

    /**
     * Finds the first number in the range [start, end] that is divisible by the given divisor.
     *
     * @param start   The start of the range (inclusive).
     * @param end     The end of the range (inclusive).
     * @param divisor The number by which divisibility is checked.
     * @return The first number in the range that is divisible by the divisor, or -1 if no such number is found.
     */
    public static int findFirstDivisible(int start, int end, int divisor) {
        for (int number = start; number <= end; number++) {
            if (number % divisor == 0) {
                return number;
            }
        }
        return -1; // Return -1 if no number is found
    }
}
