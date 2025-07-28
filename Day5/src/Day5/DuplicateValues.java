package Day5;

import java.util.Scanner;

public class DuplicateValues {
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
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if((arr[i]==arr[j])&&(i!=j)) {
					System.out.println("Duplicate element :"+arr[j]);
				}
			}
		}
		s.close();
	}
}
