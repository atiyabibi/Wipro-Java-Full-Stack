package Day5;

import java.util.Scanner;

public class ReverseArray {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		int []arr=new int[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
//		int b[]=new int[arr.length];
//		for(int i=0;i<n;i++)
//		{
//			b[i]=arr[n-1-i];
//		}
		for(int i=0;i<n/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i-1];
			arr[n-i-1]=temp;
		}
		for (int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
		s.close();
	}
}
