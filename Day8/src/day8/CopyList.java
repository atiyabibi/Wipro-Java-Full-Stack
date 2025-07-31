package day8;
import java.util.ArrayList;
import java.util.Collections;
public class CopyList {
public static void main(String args[]) {
	ArrayList<Integer> nums= new ArrayList<Integer>();
	nums.add(25);
	nums.add(56);
	nums.add(78);
	nums.add(89);
	nums.add(64);
	ArrayList<Integer> duplicate=new ArrayList<Integer>();
	duplicate.add(1);
	duplicate.add(2);
	duplicate.add(3);
	duplicate.add(4);
	duplicate.add(5);
	Collections.copy(duplicate,nums);
	System.out.println(nums);
	System.out.println(duplicate);
}
}
