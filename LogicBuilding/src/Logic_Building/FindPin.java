package Logic_Building;

import java.util.Scanner;

public class FindPin {
	public static int findPin(int input1,int input2,int input3,int input4) {
	int min1=findSmallestDigit(input1);
    int min2=findSmallestDigit(input2);
    int min3=findSmallestDigit(input3);
    return (min1*min2*min3)+input4;
}
private static int findSmallestDigit(int num){
    int mindigit=9;
    while(num>0){
        int digit=num%10;
        if(digit<mindigit){
            mindigit=digit;
        }
        num/=10;
    }
    return mindigit;
}
public static void main(String args[]) {
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int n2=s.nextInt();
	int n3=s.nextInt();
	int n4=s.nextInt();
	System.out.println(findPin(n1,n2,n3,n4));
	s.close();
}
}


