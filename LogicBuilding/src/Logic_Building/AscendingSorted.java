package Logic_Building;

import java.util.Scanner;

public class AscendingSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		boolean flag=true;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]<arr[j+1]) {
					flag=false;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		if(flag) {
			System.out.println("The array is sorted in ascending order");
		}
		else {
			System.out.println("The array is not sorted in ascending order");
		}
	}

}
