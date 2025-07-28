package Day5;

import java.util.Scanner;

public class MergeArrays {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter length of array 1");
		int n=s.nextInt();
		System.out.println("Enter length of array 2");
		int m=s.nextInt();
		int []a=new int[n];
		int []b=new int[m];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<m;i++)
		{
			b[i]=s.nextInt();
		}
		int c[]=new int[n+m];
		int j=0;
		for(int i=0;i<n;i++)
		{
			c[j]=a[i];
			j++;
		}
		for(int i=0;i<m;i++)
		{
			c[j]=b[i];
			j++;
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		s.close();
	}
}
