package TopBrainsCollections;

public class UniversityGradingSystem {

	public static void main(String[] args) {

	}

}
class CourseResult{
    private Integer internalMarks;
    private Integer externalMarks;
	public CourseResult(Integer internalMarks, Integer externalMarks) {
		this.internalMarks = internalMarks;
		this.externalMarks = externalMarks;
	}
	public Integer getInternalMarks() {
		return internalMarks;
	}
	public void setInternalMarks(Integer internalMarks) {
		this.internalMarks = internalMarks;
	}
	public Integer getExternalMarks() {
		return externalMarks;
	}
	public void setExternalMarks(Integer externalMarks) {
		this.externalMarks = externalMarks;
	}
    
}
class Student{
	public int studentId;
	public String name;
	CourseResult result;
	public Student(int studentId, String name, CourseResult result) {
		this.studentId = studentId;
		this.name = name;
		this.result = result;
	}
}
class GradingService {
	public  Integer calculateFinalScore(Student s) {
		if(s.result.getInternalMarks()!=null && s.result.getExternalMarks()!=null) {
		return (int) (s.result.getInternalMarks()*0.4+s.result.getExternalMarks()*0.5);}
		else {
			return null;
		}
	}
	public String assignGrade(Student s) {
		if(calculateFinalScore(s)>=75) {
			return "Grade A";
		}
		else if(calculateFinalScore(s)>=60) {
			return "Grade B";
		}
		else if(calculateFinalScore(s)>=40) {
			return "Grade C";
		} else {
			return "Fail";
		}
	}
	public void generateResult(Student s) {
		if(calculateFinalScore(s)!=null) {
			System.out.println(s.name+" --> Final Score: "+calculateFinalScore(s)+" -->"+assignGrade(s));
		} else {
			System.out.println(s.name+" Result Incomplete");
		}
	}
}
