package TopBrainsCollections;

public class StudentExamResultProcessingSystem {
public static void main(String[] args) {
	ResultService[] results={
		new ResultService(1, "Asha", 70, 65, 60),
		new ResultService(2, "Rohan", 35, null, 40),
		new ResultService(3, "Kiran", 30, 25, 20)
	};
	for(ResultService r:results) {
		r.isPassed();
	}
}
}
class Student{
	private Integer studentId;
	private String studentName;
	private Integer mathsMarks;
	private Integer scienceMarks;
	private Integer englishMarks;
	public Student(Integer studentId, String studentName, Integer mathsMarks, Integer scienceMarks,
			Integer englishMarks) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.mathsMarks = mathsMarks;
		this.scienceMarks = scienceMarks;
		this.englishMarks = englishMarks;
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Integer getMathsMarks() {
		return mathsMarks;
	}
	public void setMathsMarks(Integer mathsMarks) {
		this.mathsMarks = mathsMarks;
	}
	public Integer getScienceMarks() {
		return scienceMarks;
	}
	public void setScienceMarks(Integer scienceMarks) {
		this.scienceMarks = scienceMarks;
	}
	public Integer getEnglishMarks() {
		return englishMarks;
	}
	public void setEnglishMarks(Integer englishMarks) {
		this.englishMarks = englishMarks;
	}
	
}
class ResultService extends Student{

	public ResultService(Integer studentId, String studentName, Integer mathsMarks, Integer scienceMarks,
			Integer englishMarks) {
		super(studentId, studentName, mathsMarks, scienceMarks, englishMarks);
	}
	public int getSafeMarks(Integer marks) {
		if(marks==null) {
			return 0;
		}
		return marks;
	}
	public int calculateTotal() {
		return getSafeMarks(getEnglishMarks())+getSafeMarks(getMathsMarks())+getSafeMarks(getScienceMarks());
	}
	public double calculateAverage() {
		return (double) calculateTotal()/3;
	}
	public void isPassed() {
		if(calculateAverage()>=40) {
			System.out.println(getStudentName()+" --> Total: "+calculateTotal()+" --> Avg: "+(int)calculateAverage()+" --> Pass");
		} else {
			System.out.println(getStudentName()+" --> Total: "+calculateTotal()+" --> Avg: "+(int)calculateAverage()+" --> Fail");

		}
	}
}
