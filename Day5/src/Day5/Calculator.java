package Day5;

import java.util.Scanner;

public class Calculator {
	public static void main (String args[]) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		char ch;
		ch=s.next().charAt(0);
		switch(ch)
		{
		case '+':System.out.println("The addition of two numbers="+(a+b));
		break;
		case '-':
		System.out.println("The subtraction of two numbers="+(a-b));
		break;
		case '*':
		System.out.println("The multiplication of two numbers="+(a*b));
		break;
		case '/':
		System.out.println("The division of two numbers="+(a/b));
		break;
		case '%':
		System.out.println("The remainder of two numbers="+(a%b));
		break;
		default:System.out.println("Please enter a valid operator");
		}
		s.close();
	}
}
