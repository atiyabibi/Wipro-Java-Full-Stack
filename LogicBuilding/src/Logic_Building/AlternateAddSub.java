package Logic_Building;

import java.util.Scanner;

public class AlternateAddSub {
	public static int addSub(int input1,int input2) {
		if(input1%2==0){
            if(input2==1){
                return input1/2;
            }
            else if(input2==2){
                return (3*input1)/2;
            }
        }
        else{
            if(input2==1){
                return (input1+1)/2;
            }
            else if(input2==2){
                return (3*(input1-1))/2+1;
            }
        }
        return 0;
    }
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int opt=s.nextInt();
		System.out.println(addSub(n,opt));
		s.close();
	}

}
