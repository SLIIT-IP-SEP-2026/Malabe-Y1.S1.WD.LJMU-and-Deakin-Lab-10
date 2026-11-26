import java.util.Scanner;

public class IT26102620Lab10Q1B {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark: ");
        int mark = input.nextInt();

        // Validate the mark
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        // Determine the grade
        char grade;

        if (mark >= 75) {
            grade = 'A';
        }
        else if (mark >= 60) {
            grade = 'B';
        }
        else if (mark >= 50) {
            grade = 'C';
        }
        else if (mark >= 40) {
            grade = 'D';
        }
        else {
            grade = 'F';
        }

        // Verify the assigned grade
        assert (
            (mark >= 75 && grade == 'A') ||
            (mark >= 60 && mark < 75 && grade == 'B') ||
            (mark >= 50 && mark < 60 && grade == 'C') ||
            (mark >= 40 && mark < 50 && grade == 'D') ||
            (mark >= 0 && mark < 40 && grade == 'F')
        ) : "Incorrect Grade Assigned";

        System.out.println("Your Grade is: " + grade);

        input.close();
    }
}
