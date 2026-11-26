import java.util.Scanner;

public class IT26102436Lab10Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // Assert that the mark is within 0 and 100 inclusive
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        // Runs only if the assertion passes
        System.out.println("\nMark is Validated");

        scanner.close();
    }
}
