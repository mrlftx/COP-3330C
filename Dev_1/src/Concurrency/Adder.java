package Concurrency;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class Adder implements Runnable {

	private final CountDownLatch latch;
	private static final Object countLock = new Object();
	public ArrayList<Integer> Nums = new ArrayList<Integer>(200000000);
	private static int total = 0;
	public int start = 0;
	public int end = 0;
	Random rand = new Random();

	public Adder(int s, int e, CountDownLatch latch) {
		this.start = s;
		this.end = e;
		this.latch = latch;
	}
	
	public static String getTotal() {
		return String.valueOf(total);
	}
	
	public int randNum() {
	    int randomNum = rand.nextInt((10 - 1) + 1) + 1;
	    return randomNum;
	}
	
	public void makeArray() {
		int randHold = 0;
		for(int i = start; i < end; i++) {
			randHold = randNum();
			Nums.add(randHold);
			//Nums.add(1); //For testing/timing purposes
		}
	}
	
	public void Sum() {
		int sum = 0;
		for(int i = start; i < end; i++) {
			sum = sum + Nums.get(i);
		}
		synchronized (countLock) {
			total = total + sum;
		}

	}
	
	@Override
	public void run() {
		try {
			System.out.println("Waiting");
			latch.await();
		}
		catch(InterruptedException err){
			System.out.println("Jumped the gun");
		}
		System.out.println("Go!");
		this.makeArray();
		this.Sum();
		
		System.out.println("Current Sum: " + total);
		return;
	}
}
