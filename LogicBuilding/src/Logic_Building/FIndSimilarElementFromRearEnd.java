package Logic_Building;
import java.util.HashSet;
import java.util.Scanner;
public class FIndSimilarElementFromRearEnd {
	public static int findRearEnd(int[] input1,int input2) {
	boolean pos=false;
    for(int num:input1){
        if(num>0){
            pos=true;
            break;
        }
    }
    if(!pos) return 0;
    HashSet<Integer> seen=new HashSet<>();
    for(int i=input2-1;i>=0;i--){
        int num=input1[i];
        if(num>0){
            if(seen.contains(num)){
                return num;
            }
            seen.add(num);
        }
    }
    return input1[input2-1]>0?input1[input2-1]:0;
}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		System.out.println(findRearEnd(arr,n));
		s.close();
	}
}
