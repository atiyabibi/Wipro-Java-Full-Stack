package day8;

import java.util.ArrayList;

public class EmptyArrayList {
	public static void main(String args[]) {
		ArrayList<String> homeAppliances=new ArrayList<String>();
		homeAppliances.add("Oven");
		homeAppliances.add("Washing Machine");
		homeAppliances.add("Tv");
		homeAppliances.add("Ac");
		homeAppliances.add("Mixer");
		System.out.println(homeAppliances.isEmpty());
		homeAppliances.clear();
		System.out.println(homeAppliances.isEmpty());
	}
}
