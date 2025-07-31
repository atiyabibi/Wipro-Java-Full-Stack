package day8;
import java.util.ArrayList;
import java.util.Collections;
public class PrintArrayList {
	public static void main(String args[]) {
		ArrayList<String> homeAppliances=new ArrayList<String>();
		homeAppliances.add("Oven");
		homeAppliances.add("Washing Machine");
		homeAppliances.add("Tv");
		homeAppliances.add("Ac");
		homeAppliances.add("Mixer");
		System.out.println(homeAppliances);
//		Iterate over the arraylist
		System.out.println("Iterating over the arraylist");
		for(String s: homeAppliances) {
			System.out.println(s);
		}
//	Insertion at first position
		System.out.println("Adding elemet at the index 0");
		homeAppliances.add(0,"Water heater");
		System.out.println(homeAppliances);
//		Retrieving element by index
		System.out.println("Retrieving the element by index");
		System.out.println(homeAppliances.get(5));
//		Updating arraylist
		System.out.println("Updating arraylist element");
		homeAppliances.set(3, "Vacuum cleaner");
		System.out.println(homeAppliances);
//		Removing the element at specified index
		homeAppliances.remove(3);
		System.out.println(homeAppliances);
//		Sorting the arraylist
		Collections.sort(homeAppliances);
		System.out.println(homeAppliances);
//		Search arraylist
		System.out.println(homeAppliances.contains("Yellow"));
	}
}
