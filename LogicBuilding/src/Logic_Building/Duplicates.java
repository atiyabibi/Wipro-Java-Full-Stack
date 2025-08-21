package Logic_Building;

import java.util.Arrays;
import java.util.Scanner;
import java.util.LinkedHashSet;
import java.util.Set;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
//		char c[]=str.toCharArray();
//		Arrays.sort(c);
//		String res="";
//		for(int i=1;i<c.length;i++) {
//			if(c[i]!=c[i-1]) {
//				res+=c[i];
//			}
//		}
//		System.out.println(res);
//		s.close();
		
		
		
		
//		Set<Character> set=new LinkedHashSet<>();
//		for(char ch :str.toCharArray()) {
//			set.add(ch);
//		}
//		StringBuilder sb=new StringBuilder();
//		for(char ch :set) {
//			sb.append(ch);
//		}
//		System.out.println(sb.toString());
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(sb.indexOf(String.valueOf(ch))==-1) {
				sb.append(ch);
			}
		}
		System.out.println(sb.toString());
		s.close();

	}

}
