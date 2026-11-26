import java.util.Scanner;

public class IT26102436Lab10Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the mark (0 - 100): ");
        int mark = scanner.nextInt();

        // Part (a): Assert that the mark is within 0 and 100 inclusive
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("\nMark is Validated");

        // Part (b): Determine the corresponding letter grade
        char grade;
        if (mark >= 75) {
            grade = 'A';
        } else if (mark >= 60) {
            grade = 'B';
        } else if (mark >= 50) {
            grade = 'C';
        } else if (mark >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // Part (b): Assert that the assigned grade is valid for the given mark
        assert ((mark >= 75 && grade == 'A') ||
                (mark >= 60 && mark <= 74 && grade == 'B') ||
                (mark >= 50 && mark <= 59 && grade == 'C') ||
                (mark >= 40 && mark <= 49 && grade == 'D') ||
                (mark < 40 && grade == 'F')) : "Incorrect Grade Assigned";

        // Output the final result
        System.out.println("The Grade for the Entered Mark is: " + grade);

        scanner.close();
    }
}
