package Day5;

import java.util.Scanner;

public class AddingTwoArrays {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array");
		int n=s.nextInt();
		int []a=new int[n];
		int []b=new int[n];
		System.out.println("Enter elements of array 1");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter elements of array 2");
		for(int i=0;i<n;i++)
		{
			b[i]=s.nextInt();
		}
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=a[i]+b[i];
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(c[j]>c[j+1])
				{
					int temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;

				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		System.out.println();
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(c[j]<c[j+1])
				{
					int temp=c[j];
					c[j]=c[j+1];
					c[j+1]=temp;

				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		s.close();
	}
}
