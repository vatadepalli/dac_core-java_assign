package threads_2;

public class TestRunnable {
	
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());
		// create child thrds to test concurrency
		RunnableTask m1 = new RunnableTask();
		//attach a thrd to runnable task
		Thread t1=new Thread(m1, "one");
		Thread t2=new Thread(m1, "two");
		Thread t3=new Thread(m1, "three");
		t1.start();t2.start();
		t3.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec #" + i);
			Thread.sleep(100);
		}
		System.out.println("main finished....");

	}
}
