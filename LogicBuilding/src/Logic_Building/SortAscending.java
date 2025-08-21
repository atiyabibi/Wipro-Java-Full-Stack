package Logic_Building;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {5,10,6,54,2,1,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
