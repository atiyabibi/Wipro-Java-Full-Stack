package assessment;

public class Swap {
	public static void main(String args[]) {
		int a=7;
		int b=10;
		System.out.println("Numbers a and b before swapping "+a+","+b);
		int temp;
		temp=a;
		a=b;
		b=temp;
		System.out.println("Numbers a and b after swapping "+a+","+b);
	}
}
