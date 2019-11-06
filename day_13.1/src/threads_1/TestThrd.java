package threads_1;

public class TestThrd {
	
	public static void main(String[] args) throws InterruptedException{
		System.out.println(Thread.currentThread());
		// create child thrds to test concurrency
		MyThread m1 = new MyThread("one");
		MyThread m2 = new MyThread("two");
		MyThread m3 = new MyThread("three");
		
		m1.start();
		m2.start();
		m3.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName() + " exec #" + i);
			Thread.sleep(100);
		}
		System.out.println("main over....");

	}

}
