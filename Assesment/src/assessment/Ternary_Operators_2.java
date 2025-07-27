package assessment;

public class Ternary_Operators_2 {
	public static void main(String args[]) {
		int a=10;
		int b=23;
		int c=55;
		int res;
		res=((a>b)&&(a>c))?a:((b>c)?b:c);
		System.out.println("Largest of three numbers is: "+res);
	}

}
