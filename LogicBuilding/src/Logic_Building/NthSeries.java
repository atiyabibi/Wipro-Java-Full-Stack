package Logic_Building;

import java.util.Scanner;

public class NthSeries {
	public static int seriesN(int a,int b,int c,int n) {
		int g1=b-a;
		int g2=c-b;
		int k=n-1;
		int timesG1=(k+1)/2;
		int timesG2=k/2;
		return a+timesG1*g1+timesG2*g2;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int N=s.nextInt();
		System.out.println(seriesN(a,b,c,N));
		s.close();
	}

}
