package Day5;

import java.util.Scanner;

public class Duplicate_String_arrays {
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size of array");
		int n=s.nextInt();
		s.nextLine();
		String []arr=new String[n];
		System.out.println("Enter elements of array");
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextLine();
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j])) {
					System.out.println("Duplicate element:"+arr[j]);				
					}
			}
		}
		s.close();
	}
}
