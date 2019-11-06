package EvenOdd;

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the Starting and Ending range for display");
			int start = sc.nextInt();
			int end = sc.nextInt();
			Even even = new Even(start, end, "Even");
			Odd odd = new Odd(start, end, "Odd");
			even.start();
			odd.start();
			
			try {
				even.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				odd.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("main exited....");
		}
	}

}
