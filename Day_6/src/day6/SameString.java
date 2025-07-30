package day6;

import java.util.Scanner;

public class SameString {
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string1");
		String s1=s.nextLine();
		System.out.println("Enter the string2");
		String s2=s.nextLine();
		System.out.println("Enter the string3");
		String s3=s.nextLine();
		System.out.println("\""+s1+"\"equals\""+s2+"\"?"+s1.equals(s2));
		System.out.println("\""+s2+"\"equals\""+s3+"\"?"+s2.equals(s3));
		System.out.println("\""+s1+"\"equals\""+s3+"\"?"+s1.equals(s3));
		s.close();
	}
}
