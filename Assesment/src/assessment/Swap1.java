package assessment;

public class Swap1 {
	public static void main(String args[]) {
		int a=7;
		int b=10;
		System.out.println("Numbers a and b before swapping "+a+","+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers a and b after swapping "+a+","+b);
	}
}
