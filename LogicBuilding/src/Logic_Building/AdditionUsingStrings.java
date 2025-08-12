package Logic_Building;
import java.math.BigInteger;
import java.util.Scanner;
public class AdditionUsingStrings {
	public static String addStringNumbers(String s1,String s2) {
		BigInteger a=new BigInteger(s1);
		BigInteger b=new BigInteger(s2);
		BigInteger sum=a.add(b);
		return sum.toString();
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		System.out.println(addStringNumbers(s1,s2));
		s.close();
	}
}
