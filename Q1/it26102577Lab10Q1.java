import java.util.Scanner;
public class it26102577Lab10Q1{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the mark (0 - 100): ");
		int mark = input.nextInt();
		
		assert (mark >= 0 && mark <= 100) : " Invalid Mark";
		
		System.out.println();
		System.out.println("Mark is validated");
		
		char grade;
		if (mark >75){
			grade = 'A'; 
		}
		else if (mark <= 74 && mark >= 60 ){
			grade = 'B';
		}
		
		else if (mark <= 59 && mark >= 50){
			grade = 'C';
		}
		
		else if (mark <= 49 && mark >= 40){
			grade = 'D';
		}
		
		else{
			grade = 'F';
		}
		
		assert (
            (mark >= 75 && grade == 'A') ||
            (mark >= 60 && mark < 75 && grade == 'B') ||
            (mark >= 50 && mark < 60 && grade == 'C') ||
            (mark >= 40 && mark < 50 && grade == 'D') ||
            (mark < 40 && grade == 'F')
        ) : "Incorrect Grade Assigned";

        System.out.println("Your Grade is: " + grade);
	}
}