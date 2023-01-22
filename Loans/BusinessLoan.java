package Loans;

public class BusinessLoan extends Loan{
	
	public BusinessLoan(int id, String name, int loan, int years, double prime) {
		super(id, name, loan, years);
		this.interestRate = prime * (3.2/100);
	}	
}
