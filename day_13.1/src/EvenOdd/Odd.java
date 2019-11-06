package EvenOdd;

public class Odd extends Thread {

	private int start, end;

	public Odd(int start, int end, String name) {
		super(name);
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		for (int i = start; i <= end; i++) {
			if (i % 2 != 0) {
				System.out.println(i + " ");
			}
		}
		System.out.println(Thread.currentThread().getName() + " Ended");

	}

}
