import java.util.Scanner;

public class IT26102381Lab10Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int input = sc.nextInt();

        assert input >= 0 && input <= 100 : "Invalid Mark";

        System.out.println("\nMark is Validated");

        char mark = ' ';

        if      (input >= 75) mark = 'A';
        else if (input >= 60) mark = 'B';
        else if (input >= 50) mark = 'C';
        else if (input >= 40) mark = 'D';
        else mark = 'F';

        System.out.print("The Grade for the Entered Mark is: " + mark);

        // ¯\_(ツ)_/¯ it's useless to add an assertion here.
        // The program already assigns the correct grade.
        // Invalid marks are already caught by the first assertion.
    }
}