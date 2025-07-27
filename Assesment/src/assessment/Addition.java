package assessment;

public class Addition {
	public static void main(String args[]) {
		int a=7;
		int b=10;
		while(b!=0)
		{
			int carry=(a&b)<<1;
			a=a^b;
			b=carry;
		}
		System.out.println(a);
	}
}
