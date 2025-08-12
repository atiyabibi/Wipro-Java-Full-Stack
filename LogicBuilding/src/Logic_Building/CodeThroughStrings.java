package Logic_Building;

import java.util.Scanner;

public class CodeThroughStrings {
	public static int getCodeThroughStrings(String input1) {
		input1=input1.replace(" ", "");
		int len=input1.length();
		int password=0;
		while(len>1) {
			int digit=len%10;
			password+=digit;
			len/=10;
		}
		return password;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(getCodeThroughStrings(input));
		s.close();
	}

}
