package Division;

import java.util.Scanner;

public class Divide {

	static int numA;
	static int numB;
	
	public static void main(String[] args) {
		boolean isWrong = false;
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter in the number you want to divide.");
		numA = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Enter in what you want to divide it by.");
		try {
			numB = userInput.nextInt();
			userInput.nextLine();
			if(numB == 0) 
				throw new ArithmeticException("Do not try do divide by zero. Don't be silly!");
		}
		catch(ArithmeticException err) {
			isWrong = true;
			System.out.println(err.getMessage());
		}
		if(!isWrong) {
			double test = ((double)numA/(double)numB);
			System.out.printf("%d divided by %d is %.2f%n", numA, numB, test);
		}
		userInput.close();
	}
}
