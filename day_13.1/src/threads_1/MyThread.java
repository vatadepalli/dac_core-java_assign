package threads_1;

public class MyThread extends Thread{
	
	public MyThread(String name) {
		super(name);
//		start();
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " started");
		
		for(int i=0; i<10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec #" + 1);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName() + " done");
	}
}
