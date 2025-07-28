package Day5;
import java.util.Scanner;
public class Positive_Negative_Number {	
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=s.nextInt();
		if(n>=0)
		{
			System.out.println("Number "+n+" is Positive");
		}
		else {
			System.out.println("Number "+n+" is negative");
		}
	}
}
