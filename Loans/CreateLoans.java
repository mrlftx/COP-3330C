package Loans;

import java.util.Scanner;

public class CreateLoans {
	public static void main(String[] args) {
		Loan[] group = new Loan[5];
		double prime = 0;
		Scanner userInput = new Scanner(System.in);
		String s;
		String r;
		System.out.println("Enter Prime Interest Rate");
		prime = userInput.nextDouble();
		userInput.nextLine();
		int[] reader = new int[3];
		for(int i = 0; i < 5; i++) {
			System.out.println("Enter Loan Type");
			s = userInput.nextLine();
			if(!s.equals("personal") && !s.equals("Personal") && !s.equals( "business") && !s.equals("Business")) {
				System.out.println("Enter in proper Loan type");
				i--;
				continue;
			}
			System.out.println("Enter Loan ID");
			reader[0] = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Enter Loan Customer's Last Name");
			r = userInput.nextLine();
			System.out.println("Enter Amount to be Loaned");
			reader[1] = userInput.nextInt();
			userInput.nextLine();
			System.out.println("Enter Loan Term");
			reader[2] = userInput.nextInt();
			userInput.nextLine();
				
			if(s.equals("personal") || s.equals("Personal")) {	
				group[i] = new PersonalLoan(reader[0], r, reader[1], reader[2], prime);
			}
			else if(s.equals( "business") || s.equals("Business")) {	
				group[i] = new BusinessLoan(reader[0], r, reader[1], reader[2], prime);
			}
			System.out.println("");
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Loan number " + (i+1));
			System.out.print(group[i].toString());
			System.out.println("");
		}
		userInput.close();
	}
}
