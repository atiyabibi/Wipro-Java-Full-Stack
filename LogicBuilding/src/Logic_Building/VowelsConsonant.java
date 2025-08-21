package Logic_Building;

import java.util.Scanner;

public class VowelsConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int vowel=0,consonant=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			ch=Character.toLowerCase(ch);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				vowel++;
			}
			else
				consonant++;
		}
		System.out.println("The number of vowels in the given string "+str+" are: "+vowel);
		System.out.println("The number of consonants in the given string "+str+" are: "+consonant);

	}

}
