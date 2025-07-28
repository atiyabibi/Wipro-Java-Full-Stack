package Day5;
import java.util.Scanner;
public class SumOfLastDigits {
	static int addLastDigits(int n1, int n2) {
		if(n1<0) {
			n1=(-1)*n1;
		}
		if(n2<0) {
			n2=(-1)*n2;
		}
		return (n1%10)+(n2%10);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.println(addLastDigits(n1,n2));
		s.close();
	}
}
