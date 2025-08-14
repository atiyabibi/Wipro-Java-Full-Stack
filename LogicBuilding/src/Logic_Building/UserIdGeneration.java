package Logic_Building;

import java.util.Scanner;
public class UserIdGeneration {
	public static String userId(String input1,String input2, int input3, int input4) {
		String smallerName;
        String largerName;
        if(input1.length()<input2.length()){
            smallerName=input1;
            largerName=input2;
            }
        else if(input1.length()>input2.length()){
            smallerName=input2;
            largerName=input1;
            } 
            else{
            int compare=input1.compareTo(input2);
            if(compare<0){
            smallerName=input1;
            largerName=input2;}
            else if(compare>0){
                smallerName=input2;
                largerName=input1;}else{
                smallerName=input2;
                largerName=input1;
                } 
                }
        char lastLetter[]=String.valueOf(smallerName).toCharArray();
        char valueOfLastLetter=lastLetter[smallerName.length()-1];
        int length=(int)Math.log10(input3)+1;
        int fromLeft=(input3/(int) Math.pow(10,length-input4))%10;
        int fromRight=(input3/(int) Math.pow(10,input4-1))%10;
        String userId;
        userId=""+valueOfLastLetter+largerName+fromLeft+fromRight;
        StringBuilder sb=new StringBuilder();
        for(char ch: userId.toCharArray()){
            if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }
            else if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }
            else{
                sb.append(ch);
            }
        }
        return sb.toString();		
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2=s.nextLine();
		int pin=s.nextInt();
		int n=s.nextInt();
		System.out.println(userId(s1,s2,pin,n));
		s.close();
	}
	}

