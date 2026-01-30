package TopBrainsCollections;

public class OnlineVotingEligibilityChecker {
	public static void main(String[] args) {
		VotingService voters[]= {
			new VotingService(1, "Aman", "25"),
			new VotingService(2, "Neha", "17"),
			new VotingService(3, "Rahul", "abc")
		};
		for(VotingService v:voters) {
			v.displayStatus();
		}
	}
}

class Voter{
    private Integer voterId;
    private String voterName;
    private String age;
    Voter(Integer voterId, String voterName, String age){
        this.voterId=voterId;
        this.voterName=voterName;
        this.age=age;
    }
	public Integer getVoterId() {
		return voterId;
	}
	public void setVoterId(Integer voterId) {
		this.voterId = voterId;
	}
	public String getVoterName() {
		return voterName;
	}
	public void setVoterName(String voterName) {
		this.voterName = voterName;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
}
class  VotingService extends Voter{
	
	VotingService(Integer voterId, String voterName, String age) {
		super(voterId, voterName, age);
	}
	public Integer parseAge(String age) {
		try {
			return Integer.valueOf(age);
		} catch(NumberFormatException e) {
			return null;
		}
	}
	public boolean isEligible() {
			if(parseAge(getAge())>=18) {
				return true;
			}
			else {
				return false;
		} 
	}
	public void displayStatus() {
		if(parseAge(getAge())!=null) {
			if(isEligible()) {
				System.out.println(getVoterName()+" --> Eligible to Vote");
			} else {
				System.out.println(getVoterName()+" --> Not Eligible to Vote");
			}
		} else {
			System.out.println(getVoterName()+" --> Invalid Age Input");
		}
	}
}