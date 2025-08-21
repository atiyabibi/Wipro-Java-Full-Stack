package Logic_Building;
import java.util.HashMap;
public class frequency {
	public static void main(String args[]) {
		int arr[]= {1,2,3,4,5,1,6,7,2,9,3};
//		int n=arr.length;
		HashMap<Integer,Integer> freq=new HashMap<>();
		for(int num: arr) {
			freq.put(num,freq.getOrDefault(num,0)+1);
		}
		for(int key: freq.keySet()) {
			System.out.println(key+" :"+ freq.get(key));
		}
	}
}
