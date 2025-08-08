package Threads;

public class MultipleThreads implements Runnable{
	public void run() {
		System.out.println(Thread.currentThread().getName()+"thread is running");
	}

	public static void main(String[] args) {
		Thread t1= new Thread(new MultipleThreads(),"First");
		Thread t2= new Thread(new MultipleThreads(),"Second");
		t1.start();
		t2.start();
	}

}
