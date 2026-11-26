import java.util.Scanner;

public class IT26102427Lab10Q1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        if (mark < 0 || mark > 100) {
            System.out.println("Invalid Mark");
            return;
        }

        System.out.println("Mark is Validated");

        char grade;

        if (mark >= 75)
            grade = 'A';
        else if (mark >= 60)
            grade = 'B';
        else if (mark >= 50)
            grade = 'C';
        else if (mark >= 40)
            grade = 'D';
        else
            grade = 'F';

        System.out.println("The Grade for the Entered Mark is: " + grade);
    }
}