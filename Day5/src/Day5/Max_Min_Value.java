package Day5;

import java.util.Scanner;

public class Max_Min_Value {
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
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if (arr[i]>max)
				max=arr[i];
			if (arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum element inn an array is :"+max);
		System.out.println("Minimum element in an array is:"+min);
		s.close();
	}
}
