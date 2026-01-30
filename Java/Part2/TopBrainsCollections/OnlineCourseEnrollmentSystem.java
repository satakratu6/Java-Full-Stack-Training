package TopBrainsCollections;

import java.util.LinkedHashSet;
import java.util.Objects;

public class OnlineCourseEnrollmentSystem {

}

class Student{
	private int studentId;
	private String studentName;
	private String emailId;
	public Student(int studentId, String studentName, String emailId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.emailId = emailId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	@Override
	public int hashCode() {
		return studentId + emailId.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(emailId, other.emailId) || studentId == other.studentId;
	}
	public void displayStudent() {
		System.out.println("Student ID: "+getStudentId()+", Name: "+getStudentName()+", Email: "+getEmailId());

	}
	
}
class CourseEnrollment {
	private LinkedHashSet<Student> students=new LinkedHashSet<Student>();

	
	public void enroll(Student s) {
		if(students.add(s)) {
			System.out.println("Enrolled -> Student ID: "+s.getStudentId()+", Name: "+s.getStudentName()+", Email: "+s.getEmailId());
		} else {
			System.out.println("Duplicate enrollment not allowed for Student ID: "+s.getStudentId());
		}
	}
	public void display() {
		System.out.println("Enrolled Students (Insertion Order Maintained):");
		for(Student s: students) {
			s.displayStudent();
		}
	}
}