package threadingdemo;

public class StopWatchThread implements Runnable{
	
	private Thread t;
	private String threadname;
	
	public StopWatchThread(String threadname) {
		this.threadname = threadname;
		System.out.println("Creating:"+threadname);
		
	}
	@Override
	public void run() {
		System.out.println("Working:"+threadname);
		try {
			for(int i = 1;i<= 10;i++) {
				System.out.println(threadname + ":"+i);
				Thread.sleep(1000);
			}
			
		}
		catch(InterruptedException exception){
			System.out.println("Breaking:"+threadname);
		}
		
		System.out.println("Thread ending:"+threadname);
	}
	
	public void start() {
		System.out.println("Thread object's creating.");
		if(t == null) {
			t = new Thread(this.threadname);
			t.start();
			
		}
	}

}
