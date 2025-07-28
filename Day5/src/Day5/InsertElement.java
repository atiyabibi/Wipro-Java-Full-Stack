package Day5;
import java.util.Scanner;
public class InsertElement {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int k=s.nextInt();
		arr[k]=s.nextInt();
//		for(int i=n;i>k;i--)
//		{
//			arr[i]=arr[i-1];
//		}
//		arr[k]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		s.close();
	}

}
