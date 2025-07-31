package day8;
import java.util.Scanner;
public class AddtionSubtraction {
	public static int AddSub(int n,int opt) {
		int optsum=0;
		if(opt==1) {
			for(int i=n;i>=1;i--) {
				if((n-i)%2==0) {  //n=5 i=5 1---->+5-4+3-2+1  i=4((1%2)!=0) i=3((2%2)=0) i=2((3%2)!=0) i=1((4%2)=0) 
					optsum+=i;
				}
				else optsum-=i;
			}
		}
		else if(opt==2) {
			for(int i=n;i>=1;i--) {
				if((n-i)%2==0) {
					if(optsum==0)
						optsum=i-optsum;
					else
						optsum-=i;
				}
				else optsum+=i;
			}
		}
		return optsum;
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=s.nextInt();
		System.out.println("Enter the option ");
		int opt=s.nextInt();
		System.out.println(AddSub(n,opt));
		s.close();
	}

}
