import java.util.Scanner;

public class IT26102759Lab10Q1A {

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
    }
}
