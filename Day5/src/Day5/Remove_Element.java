package Day5;

public class Remove_Element {
	public static void main(String args[])
	{
		int arr[]= {25,14,56,16,13};
		int removeIndex=0;
		for(int i=removeIndex;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		for(int i=0;i<arr.length;i++)
		System.out.println(arr[i]);
	}
}
