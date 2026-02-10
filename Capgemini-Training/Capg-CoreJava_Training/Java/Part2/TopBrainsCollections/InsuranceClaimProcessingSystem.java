package TopBrainsCollections;

public class InsuranceClaimProcessingSystem {

	public static void main(String[] args) {
		ClaimProcessor processor = new ClaimProcessor();

        InsurancePolicy health = new HealthPolicy(101, 50000.0);
        InsurancePolicy vehicle = new VehiclePolicy(202, 30000.0, true);

        processor.process(health, 20000.0);
        processor.process(vehicle, 35000.0);
        processor.process(vehicle, 25000.0);
	}

}

abstract class InsurancePolicy{
	int policyId;
	Double maxCoverage;
	
	public InsurancePolicy(int policyId, Double maxCoverage) {
		super();
		this.policyId = policyId;
		this.maxCoverage = maxCoverage;
	}
	
	
	
	public int getPolicyId() {
		return policyId;
	}



	public void setPolicyId(int policyId) {
		this.policyId = policyId;
	}



	public Double getMaxCoverage() {
		return maxCoverage;
	}



	public void setMaxCoverage(Double maxCoverage) {
		this.maxCoverage = maxCoverage;
	}



	abstract void approveClaim(Double claimAmount);
	
	public double safeAmount(Double amount) {
		if(amount==null) {
			return 0.0;
		} else {
			return amount;
		}
	}
	
}
class HealthPolicy extends InsurancePolicy{

	public HealthPolicy(int policyId, Double maxCoverage) {
		super(policyId, maxCoverage);
		// TODO Auto-generated constructor stub
	}

	@Override
	void approveClaim(Double claimAmount) {
		if(safeAmount(claimAmount)!=0.0) {
			if(claimAmount<=getMaxCoverage()) {
				System.out.println("HealthPolicy --> Claim Approved");
			} else {
				System.out.println("HealthPolicy -->  Claim Rejected (Limit Exceeded)");
			}
		} else {
			System.out.println("HealthPolicyy --> Invalid Claim Amount");
		}
	}
	
}
class VehiclePolicy extends InsurancePolicy{
	boolean accidentReported;
		
	public VehiclePolicy(int policyId, Double maxCoverage, boolean accidentReported) {
		super(policyId, maxCoverage);
		this.accidentReported = accidentReported;
	}



	@Override
	void approveClaim(Double claimAmount) {
		if(safeAmount(claimAmount)!=0.0) {
			if(claimAmount<=getMaxCoverage() && accidentReported) {
				System.out.println("VehiclePolicy --> Claim Approved");
			} else {
				System.out.println("VehiclePolicy -->  Claim Rejected (Limit Exceeded)");
			}
		} else {
			System.out.println("VehiclePolicy --> Invalid Claim Amount");
		}
	}
	
}

class ClaimProcessor {

    public void process(InsurancePolicy policy, Double claimAmount) {
        if (policy == null) {
            System.out.println("Invalid Policy");
            return;
        }

        if (claimAmount == null || claimAmount <= 0) {
            System.out.println("Invalid Claim Amount");
            return;
        }

        policy.approveClaim(claimAmount);
    }
}


