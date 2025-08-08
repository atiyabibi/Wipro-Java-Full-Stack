package Threads;

public class RunDemo implements Runnable {
	public void run() {
		System.out.println("thread is running");
	}

	public static void main(String[] args) {
		RunDemo  thread=new RunDemo();
		Thread t=new Thread(thread);
		Thread t2=new Thread(new RunDemo());
		t2.start();
		t.start();
	}

}
