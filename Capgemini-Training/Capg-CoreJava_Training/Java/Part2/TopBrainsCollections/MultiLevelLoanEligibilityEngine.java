package TopBrainsCollections;

public class MultiLevelLoanEligibilityEngine {

	public static void main(String[] args) {
		LoanApplicant a = new HomeLoanApplicant(1, 80000, 750, 25000);
        LoanApplicant b = new HomeLoanApplicant(2, 40000, null, 10000);
        LoanApplicant c = new PersonalLoanApplicant(3, 28000, 680, true);

        LoanProcessor processor = new LoanProcessor();

        processor.evaluate(a);
        processor.evaluate(b);
        processor.evaluate(c);
	}

}


abstract class LoanApplicant{
	public Integer applicantId;
	public Integer monthlyIncome;
	public Integer creditScore;
	public LoanApplicant(Integer applicantId, Integer monthlyIncome, Integer creditScore) {
		this.applicantId = applicantId;
		this.monthlyIncome = monthlyIncome;
		this.creditScore = creditScore;
	}
	public abstract boolean isEligible();
	
	public Integer safeInteger(Integer value) {
        return value == null ? 0 : value;

	}
	public Double safeDouble(Double value) {
        return value == null ? 0.0 : value;

	}
}
class HomeLoanApplicant extends LoanApplicant{
	public Integer existingEMI;

	public HomeLoanApplicant(Integer applicantId, Integer monthlyIncome, Integer creditScore, Integer existingEMI) {
		super(applicantId, monthlyIncome, creditScore);
		this.existingEMI = existingEMI;
	}

	@Override
	public boolean isEligible() {
		if(creditScore!=0) {
		if(monthlyIncome>=50000 && creditScore>=700 && existingEMI<= monthlyIncome*0.4) {
			return true;
		} else {
		return false;}}
		else {
			return false;
		}
	}
}
class PersonalLoanApplicant extends LoanApplicant{
	private Boolean salaried;

	public PersonalLoanApplicant(Integer applicantId, Integer monthlyIncome, Integer creditScore, Boolean salaried) {
		super(applicantId, monthlyIncome, creditScore);
		this.salaried = salaried;
	}

	@Override
	public boolean isEligible() {
		if(creditScore!=0) {
			if(monthlyIncome>=30000 && creditScore>=650) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}
}

class  LoanProcessor{
	public void evaluate(LoanApplicant l) {
		if(l.creditScore!=null) {
			if(l.isEligible()) {
				System.out.println("Applicant "+l.applicantId+" --> Loan Approved");
			} else {
				System.out.println("Applicant "+l.applicantId+" --> Loan Rejected");

			}
		} else {
			System.out.println("Applicant "+l.applicantId+" --> Loan Rejected (Invalid Credit Score)");

		}
	}
}