package Logic_Building;

import java.util.Scanner;

public class Anagram1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
//		char c1[]=s1.toCharArray();
//		char c2[]=s2.toCharArray();
		boolean flag=true;
		if(s1.length()!=s2.length()) {
			flag=false;
		}
		else {
			for(int i=0;i<s1.length();i++) {
				char ch=s1.charAt(i);
				if(s2.indexOf(ch)==-1) {
					flag=false;
					break;
				}
			}
		}
		if(flag) {
			System.out.println("The given strings "+s1+" and "+s2+" are anagram");
		}
		else
			System.out.println("the given strings "+s1+" and "+s2+" are not anagrams");
		s.close();
	}

}


