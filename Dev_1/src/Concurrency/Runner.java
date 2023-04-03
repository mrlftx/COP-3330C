package Concurrency;

import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

public class Runner {
	
	public static void main(String[] args) {
		long startTime = 0;
		long endTime = 0;
		long duration;
		CountDownLatch latch = new CountDownLatch(0);
		CountDownLatch latch2 = new CountDownLatch(2);

		Scanner userInput = new Scanner(System.in);
		System.out.print("Which version of the program would you like to use? (Enter the number)\n1. Single thread \t2. Multithread\n");
		int switcher = userInput.nextInt();
		userInput.nextLine();
		
		switch (switcher) {
		case 1:
			startTime = System.nanoTime();
			Adder solo = new Adder(0, 200000000, latch);
			Thread run1 = new Thread(solo);
			run1.start();
			latch.countDown();
			try {
				run1.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			endTime = System.nanoTime();
			break;
		case 2:
			startTime = System.nanoTime();
			Adder first = new Adder(0, 100000000, latch2);
			Adder second = new Adder(0, 100000000, latch2);
			Thread runM1 = new Thread(first);
			Thread runM2 = new Thread(second);
			runM1.start();
			latch2.countDown();
			runM2.start();
			latch2.countDown();
			try {
				runM1.join();
				runM2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			endTime = System.nanoTime();
			break;
		}
		duration = (endTime - startTime);
		System.out.println("Total Sum: " + Adder.getTotal() + "  Time: " + duration);
	}
}
