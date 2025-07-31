package day8;

import java.util.ArrayList;

public class ArrayListElementByPosition {
	public static void main(String args[]) {
		ArrayList<String> homeAppliances=new ArrayList<String>();
		homeAppliances.add("Oven");
		homeAppliances.add("Washing Machine");
		homeAppliances.add("Tv");
		homeAppliances.add("Ac");
		homeAppliances.add("Mixer");
		for(int i=0;i<homeAppliances.size();i++) {
			System.out.println(homeAppliances.get(i));
		}
	}
}
