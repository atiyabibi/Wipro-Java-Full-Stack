package Logic_Building;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,7,8,9,10};
		int n=arr.length+1;
		int sum;
		sum=(n*(n+1))/2;
		int arrsum=0;
		for(int i=0;i<arr.length;i++) {
			arrsum+=arr[i];
		}
		int missingElement=sum-arrsum;
		System.out.println(missingElement);
	}

}
