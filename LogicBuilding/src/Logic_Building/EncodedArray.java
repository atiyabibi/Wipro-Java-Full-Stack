package Logic_Building;

import java.util.Scanner;

public class EncodedArray {
	public static Result findOriginalArray(int[] input1, int input2) {
	int arr[]=new int[input2];
    arr[input2-1]=input1[input2-1];
    for(int i=input2-2;i>=0;i--){
        arr[i]=input1[i]-arr[i+1];
    }
    int output1=arr[0];
    int output2=0;
    for(int i=0;i<arr.length;i++){
        output2+=arr[i];
    }
    return new Result(output1,output2);
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] encoded=new int[n];
		for(int i=0;i<n;i++) {
			encoded[i]=s.nextInt();
		}
		Result r=findOriginalArray(encoded,n);
		System.out.println(r.output1);
		System.out.println(r.output2);
		s.close();
	}
}
