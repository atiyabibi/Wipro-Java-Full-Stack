package day8;

import java.util.ArrayList;

public class IntegerArrayList {
	public static void main(String args[]) {
		ArrayList<Number> nums= new ArrayList<Number>();
		nums.add(25);
		nums.add(56);
		nums.add(78.5);
		nums.add(89);
		nums.add(64);
		for(int i=0;i<nums.size();i++) {
			System.out.println(nums.get(i));
		}
	}
}
