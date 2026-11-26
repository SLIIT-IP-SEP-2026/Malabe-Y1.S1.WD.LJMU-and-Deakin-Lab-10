import java.util.Scanner;
public class IT26102441Lab10Q1{
	public static void main(String[] args){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the mark (0-100) : ");
		double mark = obj.nextDouble();
		assert (mark>=0 && mark<=100):"Invalid Mark";
		System.out.println("Mark is validated");
	}
}