package Day5;
import java.util.*;
public class Calculator1 {
	static int powerInt(int num1,int num2) {
		return (int)Math.pow(num1, num2);
	}
	static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1, num2);
	}
	public static void main(String args[]) {
		Calculator1 c=new Calculator1();
		System.out.println(c.powerInt(2,2));
		System.out.println(c.powerDouble(3,2));
	}
}
