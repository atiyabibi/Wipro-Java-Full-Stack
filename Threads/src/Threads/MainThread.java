package Threads;

public class MainThread  {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println("Current thread:"+t);
		t.setName("Threadlalalalala");
		System.out.println("New name of thread:"+t);
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			System.out.println("Main thread interrupted");
		}
	}
}
