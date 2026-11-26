import java.util.Scanner;
public class IT26102617Lab10Q1{
	public static void main(String[]args){
		
		Scanner input=new Scanner(System.in);
		
		System.out.println();
		System.out.print("Enter the mark (0-100): ");
		int mark = input.nextInt();
		
		//First Assertion -to check if the Marks is in the range
		assert (mark>=0 && mark<=100) : "Invalid Mark";
		
		System.out.println();
		System.out.println("Mark is Validated");
	}
}
		
	