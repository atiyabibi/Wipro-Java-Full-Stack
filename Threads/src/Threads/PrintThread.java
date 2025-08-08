package Threads;

public class PrintThread implements Runnable{
	public void run() {
		for(int i=1;i<=10;i++) {
			if(i==5) {
				try {
					Thread.sleep(5000);
				}catch(InterruptedException e) {
					System.out.println(e);
				}
			}
			System.out.println(i);
		}
	}
	public static void main(String args[]) {
		Thread t=new Thread(new PrintThread());
		t.start();
	}
}
