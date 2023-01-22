package Loans;

public class PersonalLoan extends Loan{
	
	public PersonalLoan(int id, String name, int loan, int years, double prime) {
		super(id, name, loan, years);
		this.interestRate = prime * (2.7/100);
	}	
}
