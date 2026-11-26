import java.util.Scanner;

public class IT26102621Lab10Q1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the mark (0 - 100): ");
        int mark = input.nextInt();

        
        assert (mark >= 0 && mark <= 100) : "Invalid Mark";

        System.out.println("Mark is Validated");

        String grade;

        
        if (mark >= 75) {
            grade = "A";
        } else if (mark >= 60) {
            grade = "B";
        } else if (mark >= 50) {
            grade = "C";
        } else if (mark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }

        
        boolean validGrade =
                (mark >= 75 && grade.equals("A")) ||
                (mark >= 60 && mark <= 74 && grade.equals("B")) ||
                (mark >= 50 && mark <= 59 && grade.equals("C")) ||
                (mark >= 40 && mark <= 49 && grade.equals("D")) ||
                (mark < 40 && grade.equals("F"));

        assert validGrade : "Incorrect Grade Assigned";

        System.out.println("The Grade for the Entered Mark is: " + grade);

        input.close();
    }
}