package day6;

import java.util.Scanner;

public class ConcatenateString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1");
		String s1=s.nextLine();
		System.out.println("Enter the string2");
		String s2=s.nextLine();
		System.out.println(s1.concat(s2));
		s.close();
	}
}
