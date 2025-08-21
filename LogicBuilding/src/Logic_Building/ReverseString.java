package Logic_Building;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello Welcome To Bitm";
		char c[]=str.toCharArray();
		String res="";
		for(int i=c.length-1;i>=0;i--) {
			res+=c[i];
		}
		System.out.println(res);
	}

}
