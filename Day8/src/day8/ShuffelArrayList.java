package day8;

import java.util.ArrayList;
import java.util.Collections;
public class ShuffelArrayList {
	public static void main(String args[]) {
		ArrayList<String> homeAppliances=new ArrayList<String>();
		homeAppliances.add("Oven");
		homeAppliances.add("Washing Machine");
		homeAppliances.add("Tv");
		homeAppliances.add("Ac");
		homeAppliances.add("Mixer");
		Collections.shuffle(homeAppliances);
		System.out.println(homeAppliances);
	}
}
