package Loans;

public class Loan implements LoanConstants {
	int loanID;
	String customerSurname;
	int amountLoaned;
	double interestRate;
	int term;
	
	public Loan() {
		throw new UnsupportedOperationException("Please enter in the details of the loan");
	}
	
	public Loan(int id, String name, int loan, int years) {
		if(loan > maxLoan) {
			System.out.print("Loan invalid. Exceeds $50,000 cap.\n");
			return;
		}
		this.loanID = id;
		this.customerSurname = name;
		this.amountLoaned = loan;
		if(years == shortLoan || years == midLoan || years == longLoan) {
			this.term = years;
		}
		else {
			System.out.print("Invalid loan term. Defaulting to short term.\n");
			this.term = shortLoan;
		}
	}	
	
	public String toString() {
		return String.format("ID: %d%nCustomer's Last Name: %s%nAmount Loaned: %d%nLength of Loan Term: %d%nInterest Rate: %1f%n", this.loanID, this.customerSurname, this.amountLoaned, this.term, this.interestRate);
	}
	
	public void equals(Loan B) {
		if(this.amountLoaned == B.amountLoaned) {
			System.out.printf("Loan %d and Loan %d are equal%n", this.loanID, B.loanID);
		}
		else {
			System.out.print("Loans are not equal\n");
		}
	}
	
}
