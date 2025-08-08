package Threads;
import java.util.Random;
public class RandomRunnable implements Runnable{
	public void run() {
		String colours[]={"white","blue","black","green","red","yellow"};
		Random r=new Random();
		while(true)
		{
			int index=r.nextInt(colours.length);
			String c=colours[index];
			if(c.equals("red"))
				break;
			else
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		Thread t=new Thread(new RandomRunnable());
		t.start();
	}

}
