package day6;
import java.util.Scanner;
public class StringIndex {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string");
		String s1=s.nextLine();
		System.out.println("Enter the value where u want the character");
		int x=s.nextInt();
		System.out.println(s1.charAt(x));
		s.close();
	}
}
