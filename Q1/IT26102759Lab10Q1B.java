import java.util.Scanner;

public class IT26102759Lab10Q1B {

    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        // First Assertion - To check if the Mark is in the Valid Range
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println();
        System.out.println("Mark is Validated");

        // Determine the Grade
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

        // Second Assertion - To verify the Grade assigned
        assert ((mark >= 75 && grade == 'A') ||
                (mark >= 60 && mark <= 74 && grade == 'B') ||
                (mark >= 50 && mark <= 59 && grade == 'C') ||
                (mark >= 40 && mark <= 49 && grade == 'D') ||
                (mark < 40 && grade == 'F')) : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}
