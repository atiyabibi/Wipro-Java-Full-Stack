package day2;
import java.util.Scanner;
public class PositiveNegativeZero {
	public static void main(String args[]) {
	Scanner s= new Scanner(System.in);
	int n=s.nextInt();
	if(n>0) {
		System.out.println("Positive number");
	}
	else if(n<0)
	{
		System.out.println("Negative number");
	}
	else
	{
		System.out.println("The number is zero");
	}
	}
}
