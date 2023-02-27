package Documentation;
/**
 * 
 * @author Luiz Felipe Tafner
 *
 */
public class Fibonacci {
	/**
	 * Method to find a Fibonacci number by its position on the Fibonacci sequence, Iterative version
	 * @param x This represents the current position in the Fibonacci sequence
	 * @param minTwo This represents the number that is two places before the current number
	 * @param minOne This represents the number that is one place before the current number
	 * @param curr This represents the number in the current position of the Fibonacci sequence
	 * @return  The Fibonnaci number at the current position in the sequence
	 */
	public static int FibIter(int x) {
		if(x <= 1)
			return x;
		int minTwo, minOne = 0, curr = 1;
		for(int i = 1; i < x; i++) {
			minTwo = minOne;
			minOne = curr;
			curr = minTwo + minOne;
		}
		return curr;
	}
	/**
	 * Method to find a Fibonacci number by its position on the Fibonacci sequence, Recursive version
	 * @param x This represents the current position in the Fibonacci sequence
	 * @return The Fibonnaci number at the current position in the sequence
	 */
	public static int FibRec(int x) {
		if (x <= 1)
			return x;
		return FibRec(x-1) + FibRec(x-2);
	}
	/**
	 * Compares the two methods to determine the operating speed of each in nanoseconds
	 * @param args The default command line arguments for Java. Unused in this program
	 */
	public static void main(String[] args) {
		int n = 0;
		
		for(int i = 0; i <= 15; i++) {
			long startTime = System.nanoTime();
			FibIter(i);
			long endTime = System.nanoTime();
			n = FibIter(i);
			long duration = (endTime - startTime);
			System.out.println("Num: " + i + "  Fib: " + n + "  Time: " + duration);
		}
		for(int i = 0; i <= 15; i++) {
			long startTime = System.nanoTime();
			FibRec(i);
			long endTime = System.nanoTime();
			n = FibRec(i);
			long duration = (endTime - startTime);
			System.out.println("Num: " + i + "  Fib: " + n + "  Time: " + duration);
		}
	}
}
