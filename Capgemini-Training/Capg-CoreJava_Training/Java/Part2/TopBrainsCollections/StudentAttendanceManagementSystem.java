package TopBrainsCollections;

import java.util.ArrayList;
import java.util.List;

public class StudentAttendanceManagementSystem {
	public static void main(String[] args) {
		AttendanceManager students[]= {
			new Student(101, "Rahul", true),
			new Student(102, "Anjali",false),
			new Student(103, "Vikram", true),
			new Student(104, "Sneha", false)
	
		};
		for(AttendanceManager a:students) {
			a.add(a.getS());
			a.displayAllStudents();
			a.displayPresentStudents();
			a.displayAbsenttStudents();
			a.markedAttendance(102, true);
			a.displayAllStudents();
		}
	}

}
class Student{
	private int rollNumber;
	private String studentName;
	private boolean isPresent;
	public Student(int rollNumber, String studentName, boolean isPresent) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.isPresent = isPresent;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public boolean isPresent() {
		return isPresent;
	}
	public void setPresent(boolean isPresent) {
		this.isPresent = isPresent;
	}
	public void displayStudents() {
		System.out.println("All Students:");	
		System.out.println("Roll No: "+rollNumber+", Name: "+studentName+", Attendance: "+((isPresent)?"Present":"Absent"));
	}
}
class AttendanceManager{
	List<Student> l=new ArrayList<Student>();
	Student s;
	public AttendanceManager(Student s) {
		this.s=s;
	}
	
	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	public void add(Student s) {
		l.add(s);
	}
	public void markedAttendance(int rollNumber, boolean status) {
		s.setPresent(status);
	}
	public void displayAllStudents() {
		s.displayStudents();
	}
	public void displayPresentStudents() {
		for(int i=0;i<l.size();i++) {
			l.get(s.isPresent=="true"){
				s.displayStudents();
			}
		}
	}
	public void displayAbsenttStudents() {
		for(int i=0;i<l.size();i++) {
			l.get(s.isPresent=="true"){
				s.displayStudents();
			}
		}
	}
}
