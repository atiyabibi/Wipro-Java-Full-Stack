package Logic_Building;
import java.util.HashMap;
import java.util.Scanner;
public class Password {
	public static int findPassword(int... numbers) {
	int sumOfStable=0;
    int sum2=0;
//    int numbers[]={input1,input2,input3,input4,input5};
    for(int n:numbers){
        int digits[]=convertDigits(n);
        if(checkStability(digits)){
            sumOfStable+=n;
        }else{
            sum2+=n;;
        }
    }
    return sumOfStable-sum2;
}
public static boolean checkStability(int []num){
    HashMap<Integer,Integer> freq=new HashMap<>();
    for(int n:num){
        if(!freq.containsKey(n)){
            freq.put(n,1);
        }else{
            freq.put(n,freq.get(n)+1);
        }
    }
    int exceptedfreq=-1;
    for(int val:freq.values()){
        if(exceptedfreq==-1){
            exceptedfreq=val;
        }
        else if(val!=exceptedfreq){
            return false;
        }
    }
    return true;
}
public static int[] convertDigits(int num){
    String str=String.valueOf(num);
    int []digits=new int[str.length()];
    for(int i=0;i<str.length();i++){
        digits[i]=Character.getNumericValue(str.charAt(i));
    }
    return digits;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		int n4=s.nextInt();
		int n5=s.nextInt();
		System.out.println(findPassword(n1,n2,n3,n4,n5));
		s.close();

	}

}
