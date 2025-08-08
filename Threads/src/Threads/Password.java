package Threads;
import java.util.HashMap;
import java.util.Scanner;
public class Password {
//	public static int passwordGeneration(int n1,int n2,int n3,int n4, int n5) {
//		String str1=String.valueOf(n1);
//		String str2=String.valueOf(n2);
//		String str3=String.valueOf(n3);
//		String str4=String.valueOf(n4);
//		String str5=String.valueOf(n5);
//		char c1[]=str1.toCharArray();
//		char c2[]=str2.toCharArray();
//		char c3[]=str3.toCharArray();
//		char c4[]=str4.toCharArray();
//		char c5[]=str5.toCharArray();
//		int num1[]=convertDigits(c1);
//		int num2[]=convertDigits(c2);
//		int num3[]=convertDigits(c3);
//		int num4[]=convertDigits(c4);
//		int num5[]=convertDigits(c5);
//		int stable=0;
//		int unstable=0;
//		if(checkStability(num1)) {
//			stable++;
//		}
//		else
//			unstable++;
//		if(checkStability(num2)) {
//			stable++;
//		}
//		else
//			unstable++;
//		if(checkStability(num3)) {
//			stable++;
//		}
//		else
//			unstable++;
//		if(checkStability(num4)) {
//			stable++;
//		}
//		else
//			unstable++;
//		if(checkStability(num5)) {
//			stable++;
//		}
//		else
//			unstable++;
//		int password;
//		password=(unstable*10)+stable;
//		return password;
//		
//	}
	public static int passwordGeneration(int...numbers) {
		 int stable = 0, unstable = 0;

	        for (int n : numbers) {
	            int[] digits = convertDigits(String.valueOf(n).toCharArray());
	            if (checkStability(digits)) {
	                stable++;
	            } else {
	                unstable++;
	            }
	        }

	        return (unstable * 10) + stable;
	    }
	public static boolean checkStability(int num[]) {
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int n:num) {
			freq.put(n, freq.getOrDefault(n,0)+1);
		}
		int expectedFreq = -1;
	    for (int value : freq.values()) {
	        if (expectedFreq == -1) {
	            expectedFreq = value; // store the first frequency
	        } else if (value != expectedFreq) {
	            return false; // mismatch → unstable
	        }
	    }
	    return true; // all match → stable
	}
	public static int[] convertDigits(char c[]) {
		int digits[]=new int[c.length];
		for(int i=0;i<c.length;i++) {
			digits[i]=Character.getNumericValue(c[i]);
		}
		return digits;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int n4=s.nextInt();
		int n5=s.nextInt();
		System.out.println(passwordGeneration(n1,n2,n3,n4,n5));
		s.close();
	}

}
