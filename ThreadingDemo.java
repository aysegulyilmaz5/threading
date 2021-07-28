package threadingdemo;

public class ThreadingDemo {
	public static void main(String[] args) {
		StopWatchThread thread1 = new StopWatchThread("thread1");
		StopWatchThread thread2 = new StopWatchThread("thread2");
		StopWatchThread thread3 = new StopWatchThread("thread3");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}
